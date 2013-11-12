/*** * Excerpted from "The Definitive ANTLR 4 Reference", * published by The Pragmatic Bookshelf. * Copyrights apply to this code. It may not be used to create training material,  * courses, books, articles, and the like. Contact us if you are in doubt. * We make no guarantees that this code is fit for any purpose.  * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.***/import java.util.ArrayList;import java.util.HashMap;import java.util.List;import java.util.Map;import com.google.gson.Gson;import com.google.gson.JsonObject;public class TransVisitor extends JaqlSampleBaseVisitor<Integer> {    /** "memory" for our calculator; variable/value pairs go here */	class JsonQueryTree{		String type = null;		JsonQueryTree input = null;		JsonQueryTree left_input = null;		JsonQueryTree right_input = null;		List<String> projection_attibute_set = null;		Condition selection_condition = null;		String left_join_attribute = null;		String right_join_attribute = null;		String windowsize = null;		String stream_source = null;			}		public enum DataType {STREAM,RELATION};	public enum OperationType {JOIN, FILTER, TRANS, GROUP, STREAM, WINDOW, NULL};	    private String result;    public static boolean haveRename;    public static String renameId;    private String condition = null;    private String condVar = null;    private OperationType currentOp = OperationType.NULL;    private Map<String, DataType> idTypeMap = new HashMap<String, DataType>();    private Map<String, JsonQueryTree> idValueMap = new HashMap<String, JsonQueryTree>();    private JsonQueryTree currentTree = null;    private Condition currentCondition = null;        private String[] joinId = new String[2];    private String[] joinIdRename = new String[2];        private void init(){    	result = null;    	haveRename = false;    	renameId = null;    	condition = null;    	condVar = null;    	currentOp = OperationType.NULL;    	//idTypeMap.clear();    	//idValueMap.clear();    	currentTree = null;    	joinId[0] = joinId[1] = null;    	joinIdRename[0] = joinIdRename[1] = null;    	currentCondition = null;    }        @Override    public Integer visitAssignView(JaqlSampleParser.AssignViewContext ctx) {    	String idName = ctx.ID().getText();    	visitPipe(ctx.pipe());    	if(currentTree == null) throw new SemanticErrorException("wrong in assignView: currentTree empty!!!");    	if(currentTree.type == "istream" || currentTree.type == "dstream" || currentTree.type == "rstream"){    		idTypeMap.put(idName, DataType.STREAM);    	}    	else idTypeMap.put(idName, DataType.RELATION);    	    	idValueMap.put(idName, currentTree);    	return 0;    }        @Override    public Integer visitReadStream(JaqlSampleParser.ReadStreamContext ctx) {     	String idName = ctx.ID().getText();    	JsonQueryTree tmpTree = new JsonQueryTree();    	tmpTree.type = "leaf";    	tmpTree.stream_source = ctx.STRING().getText().replaceAll("\"", "");    	//System.out.println("put id:" + idName);    	idTypeMap.put(idName, DataType.STREAM);    	idValueMap.put(idName, tmpTree);    	return 0;    }        @Override public Integer visitJoin(JaqlSampleParser.JoinContext ctx) {     	currentOp = OperationType.JOIN;    	if(currentTree != null) throw new SemanticErrorException("currenTree not empty in join");    	currentTree = new JsonQueryTree();    	currentTree.type = "join";    	if(ctx.joinVar(0).ID().size() == 2){    		joinIdRename[0] = ctx.joinVar(0).ID(0).getText();    		joinId[0] = ctx.joinVar(0).ID(1).getText();    	}    	else{    		joinIdRename[0] = null;    		joinId[0] = ctx.joinVar(0).ID(0).getText();    	}    	    	if(ctx.joinVar(1).ID().size() == 2){    		joinIdRename[1] = ctx.joinVar(1).ID(0).getText();    		joinId[1] = ctx.joinVar(1).ID(1).getText();    	}    	else{    		joinIdRename[1] = null;    		joinId[1] = ctx.joinVar(1).ID(0).getText();    	}    	    	if(idTypeMap.get(joinId[0]) != DataType.RELATION ||     			idTypeMap.get(joinId[1]) != DataType.RELATION){    		throw new SemanticErrorException("join input type wrong, expecting relation type");    	}    	currentTree.left_input = idValueMap.get(joinId[0]);    	currentTree.right_input = idValueMap.get(joinId[1]);    	    	return visitChildren(ctx);     	    }            @Override     public Integer visitVarID(JaqlSampleParser.VarIDContext ctx) {    	int idPos = checkJoinId(ctx.ID(0).getText());    	if(idPos == 0) currentTree.left_join_attribute = ctx.ID(1).getText();		else currentTree.right_join_attribute = ctx.ID(1).getText();    	    	return 0;    }    @Override     public Integer visitVar(JaqlSampleParser.VarContext ctx) throws SemanticErrorException {     	switch (currentOp) {		case TRANS:			if(haveRename){				if(ctx.ID().size() != 2){					throw new SemanticErrorException("undefined variable: $");				}				if(! ctx.ID(0).getText().equals(renameId)){					throw new SemanticErrorException("variable "+ctx.ID(0).getText()+" undefined");				}				currentTree.projection_attibute_set.add(ctx.ID(1).getText());			}			else{				if(ctx.ID().size() != 1){					throw new SemanticErrorException("variable "+ctx.ID(0).getText()+" undefined");				}				currentTree.projection_attibute_set.add(ctx.ID(0).getText());			}			//TODO case GROUP:		default:			break;		}    	return visitChildren(ctx);     }    /** ID '=' expr NEWLINE */    @Override    public Integer visitStat(JaqlSampleParser.StatContext ctx){    	init();    	    	try {    		visitChildren(ctx);        	        	Gson gson = new Gson();        	if(ctx.ID() != null){        		String id = ctx.ID().getText();        		if(! idTypeMap.containsKey(id)){        			throw new SemanticErrorException("variale not found");        		}        		currentTree = idValueMap.get(id);        	}        	        	if(ctx.assignView() != null || ctx.readStream() != null) return 0;        	if(currentTree != null) System.out.println(gson.toJson(currentTree));        			} catch (SemanticErrorException e) {			System.err.println(e.getMessage());			e.printStackTrace();		}    	    	return 0;    }        @Override     public Integer visitPipe(JaqlSampleParser.PipeContext ctx) {    	if(currentTree != null) throw new SemanticErrorException("currenTree not empty in pipe");    	String idName = ctx.ID().getText();    	    	//System.out.println("check id:" + idName);    	if(! idTypeMap.containsKey(idName)){    		throw new SemanticErrorException("variable "+idName+" undefined");    	}    	    	currentTree = idValueMap.get(idName);    	    	for(int i=0;i<ctx.pipeExpr().size();i++) visit(ctx.pipeExpr(i));    	return 0;    }        @Override    public Integer visitGroupSingleLabel(JaqlSampleParser.GroupSingleLabelContext ctx) {    	currentOp = OperationType.GROUP;    	if(isStream(currentTree)){    		throw new SemanticErrorException("wrong input type: expecting relation type");    	}    	JsonQueryTree tmp = new JsonQueryTree();    	tmp.type = "group";    	tmp.input = currentTree;    	currentTree = tmp;    	//TODO    	return visitChildren(ctx);     }        @Override    public Integer visitFilterLabel(JaqlSampleParser.FilterLabelContext ctx) {    	currentOp = OperationType.FILTER;    	if(isStream(currentTree)){    		throw new SemanticErrorException("wrong input type: expecting relation type");    	}    	JsonQueryTree tmp = new JsonQueryTree();    	tmp.type = "selection";    	tmp.input = currentTree;    	currentTree = tmp;    	    	currentCondition = null;    	        haveRename = false;        if(ctx.ID() != null){        	haveRename = true;        	renameId = ctx.ID().getText();        }                currentTree.selection_condition = new CondVisitor().visit(ctx);                return 0;    }        @Override    public Integer visitTansformLabel(JaqlSampleParser.TansformLabelContext ctx) {     	currentOp = OperationType.TRANS;    	if(isStream(currentTree)){    		throw new SemanticErrorException("wrong input type: expecting relation type");    	}    	JsonQueryTree tmp = new JsonQueryTree();    	tmp.type = "projection";    	tmp.input = currentTree;    	tmp.projection_attibute_set = new ArrayList<String>();    	currentTree = tmp;    	    	haveRename = false;    	if(ctx.ID() != null){    		haveRename = true;    		renameId = ctx.ID().getText();    	}    	    	return visitChildren(ctx);    }        @Override    public Integer visitStreamLabel(JaqlSampleParser.StreamLabelContext ctx) {     	currentOp = OperationType.STREAM;    	if(isStream(currentTree)){    		throw new SemanticErrorException("wrong input type: expecting relation type");    	}    	JsonQueryTree tmp = new JsonQueryTree();    	tmp.type = ctx.stream().getText();    	tmp.input = currentTree;    	currentTree = tmp;    	return 0;    }        @Override     public Integer visitWindowLabel(JaqlSampleParser.WindowLabelContext ctx) {    	currentOp = OperationType.WINDOW;    	if(! isStream(currentTree)){    		throw new SemanticErrorException("wrong input type: expecting stream type");    	}    	JsonQueryTree tmp = new JsonQueryTree();    	tmp.input = currentTree;    	currentTree = tmp;    	    	return visit(ctx.windowRange());    	    }        @Override     public Integer visitWindowTimeLabel(JaqlSampleParser.WindowTimeLabelContext ctx) {    	currentTree.type = "rangewindow";    	    	if(ctx.INT() == null) currentTree.windowsize = "unbounded";    	else{    		int timeQuan = Integer.parseInt(ctx.INT().getText());    		String timeUnit = ctx.timeUnit().getText();    		    		currentTree.windowsize = timeQuan + " " + timeUnit;    	}    	    	return 0;    	    }        @Override     public Integer visitWindowRowLabel(JaqlSampleParser.WindowRowLabelContext ctx) {    	currentTree.type = "rowwindow";    	    	if(ctx.INT() == null) currentTree.windowsize = "unbounded";    	else{    		int size = Integer.parseInt(ctx.INT().getText());    		currentTree.windowsize = ""+size;    	}    	    	return 0;    	    }        @Override     public Integer visitWindowPartitionLabel(JaqlSampleParser.WindowPartitionLabelContext ctx) {    	currentTree.type = "partitionwindow";    	throw new SemanticErrorException(" partition window not supported yet");    	    	//return 0;    }        private int checkJoinId(String id){    	boolean res0,res1;    	if(joinIdRename[0]!=null) res0 = id.equals(joinIdRename[0]);    	else res0 = id.equals(joinId[0]);    	    	if(joinIdRename[1]!=null) res1 = id.equals(joinIdRename[1]);    	else res1 = id.equals(joinId[1]);    	    	if(res0 && !res1) return 0;    	else if(!res0 && res1) return 1;    	else if(!res0 && !res1) throw new SemanticErrorException("variable "+id+" undefined");    	else throw new SemanticErrorException("duplicated id names");    }        private boolean isStream(JsonQueryTree tree){    	if(tree.type == null){    		System.err.println("empty tree");    		return false;    	}    	if(tree.type.equals("leaf")||tree.type.contains("stream")) return true;    	else return false;    	    }}