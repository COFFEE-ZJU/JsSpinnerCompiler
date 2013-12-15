package visitors;/*** * Excerpted from "The Definitive ANTLR 4 Reference", * published by The Pragmatic Bookshelf. * Copyrights apply to this code. It may not be used to create training material,  * courses, books, articles, and the like. Contact us if you are in doubt. * We make no guarantees that this code is fit for any purpose.  * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.***/import java.util.ArrayList;import java.util.HashMap;import java.util.List;import java.util.Map;import jsonAPI.JsonExpression;import jsonAPI.JsonProjection;import jsonAPI.JsonQueryTree;import others.JsonSchema;import antlrGen.JaqlGrammarBaseVisitor;import antlrGen.JaqlGrammarParser;import constants.Constants;import constants.Constants.*;import constants.SemanticErrorException;public class JaqlVisitor extends JaqlGrammarBaseVisitor<Integer> {    /** "memory" for our calculator; variable/value pairs go here */	public List<JsonQueryTree> resultTrees = new ArrayList<JsonQueryTree>();		private boolean haveRename;	private String renameId;        private OperationType currentOp = OperationType.NULL;//	private Map<String, DataType> idTypeMap = new HashMap<String, DataType>();    private Map<String, JsonQueryTree> idValueMap = new HashMap<String, JsonQueryTree>();//	private Map<String, JsonSchema> idSchemaMap = new HashMap<String, JsonSchema>();    private JsonQueryTree currentTree = null;//	private JsonSchema currentSchema = null;    private JsonSchema prevSchema = null;    private String groupKeyVar = null;    private JsonExpression groupByAttrExpr = null;    private JsonExpression joinLeftAttrExpr = null;    private JsonExpression joinRightAttrExpr = null;        private String[] joinId = new String[2];    private String[] joinIdRename = new String[2];    private JsonSchema[] joinSchema = new JsonSchema[2];        private void init(){    	haveRename = false;    	renameId = null;    	groupKeyVar = null;    	currentOp = OperationType.NULL;    	//idTypeMap.clear();    	//idValueMap.clear();    	currentTree = null;//    	currentSchema = null;    	prevSchema = null;    	joinId[0] = joinId[1] = null;    	joinIdRename[0] = joinIdRename[1] = null;    	joinSchema[0] = joinSchema[1] = null;    	groupByAttrExpr = null;    	joinLeftAttrExpr = null;    	joinRightAttrExpr = null;    }        /** ID '=' expr NEWLINE */	@Override	public Integer visitStat(JaqlGrammarParser.StatContext ctx){		init();				try {			visitChildren(ctx);	    		    	if(ctx.identifier() != null){	    		String id = ctx.identifier().getText();	    		if(! idValueMap.containsKey(id)){	    			throw new SemanticErrorException("variale not found");	    		}	    		currentTree = idValueMap.get(id);	    	}	    		    	//System.out.println(currentSchema);	    		    	if(ctx.assignView() != null || ctx.readStream() != null) return 0;	    	if(currentTree != null){	    		if(! Constants.isStreamType(currentTree.type)){	    			System.err.println(currentTree.type);	    			throw new SemanticErrorException("output query should be stream type");	    		}	    		JsonQueryTree tmp = new JsonQueryTree();	    		tmp.type = JsonOpType.root;	    		tmp.input = currentTree;	    		//System.out.println(gson.toJson(tmp));	    		resultTrees.add(tmp);	    	}	    			} catch (SemanticErrorException e) {			System.err.println(e.getMessage());			JsonQueryTree tmp = new JsonQueryTree();			tmp.type = JsonOpType.error;			tmp.error_message = e.getMessage();			resultTrees.add(tmp);			e.printStackTrace();		}				return 0;	}	@Override	    public Integer visitAssignView(JaqlGrammarParser.AssignViewContext ctx) {	    	String idName = ctx.identifier().getText();	    	if(ctx.pipe() != null) visit(ctx.pipe());	    	else visit(ctx.join());	    	if(currentTree == null) throw new SemanticErrorException("wrong in assignView: currentTree empty!!!");	    	if(Constants.isStreamType(currentTree.type))	    		currentTree.dataType = DataType.STREAM;	    	else 	    		currentTree.dataType = DataType.RELATION;	    		    	idValueMap.put(idName, currentTree);	//    	idSchemaMap.put(idName, currentSchema);	    	return 0;	    }	//    @Override 	//    public Integer visitSetMaster(JaqlSampleParser.SetMasterContext ctx) {	//    	String idName = ctx.identifier().getText();	//    	if(! idTypeMap.containsKey(idName)) throw new SemanticErrorException("variable "+idName+" undefined");	//    		//    	JsonQueryTree tree = idValueMap.get(idName);	//    	if(!tree.type.equals("leaf")) throw new SemanticErrorException(idName+" is not leaf stream source");	//    		//    	tree.is_master = true;	//    	return 0; 	//    }	    	    @Override	    public Integer visitReadStream(JaqlGrammarParser.ReadStreamContext ctx) { 	    	String idName = ctx.identifier().getText();	    	JsonQueryTree tmpTree = new JsonQueryTree();	    	tmpTree.type = JsonOpType.leaf;	    	tmpTree.stream_source = ctx.STRING().getText().replaceAll("\"", "");	    	if(ctx.FALSE() != null) tmpTree.is_master = false;	    	else tmpTree.is_master = true;	    	//System.out.println("put id:" + idName);	    	tmpTree.schema = JsonSchema.getSchema(tmpTree.stream_source);	    	tmpTree.dataType = DataType.STREAM;	    	idValueMap.put(idName, tmpTree);	//    	idSchemaMap.put(idName, JsonSchema.getSchema(tmpTree.stream_source));	    	return 0;	    }		@Override 	    public Integer visitJoin(JaqlGrammarParser.JoinContext ctx) { 	    	currentOp = OperationType.JOIN;	    	if(currentTree != null) throw new SemanticErrorException("currenTree not empty in join");	    	currentTree = new JsonQueryTree();	    	currentTree.type = JsonOpType.join;	    	//currentSchema = new JsonSchema(JsonValueType.OBJECT);	    	if(ctx.joinVar(0).preserve != null)	    		currentTree.left_outer = true;	    	else currentTree.left_outer = false;	    	if(ctx.joinVar(1).preserve != null)	    		currentTree.right_outer = true;	    	else currentTree.right_outer = false;	    		    	String[] names = new String[2];	    		    	if(ctx.joinVar(0).identifier().size() == 2){	    		joinIdRename[0] = ctx.joinVar(0).identifier(0).getText();	    		joinId[0] = ctx.joinVar(0).identifier(1).getText();	    		names[0] = joinIdRename[0];	    	}	    	else{	    		joinIdRename[0] = null;	    		joinId[0] = ctx.joinVar(0).identifier(0).getText();	    		names[0] = joinId[0];	    	}	    		    	if(ctx.joinVar(1).identifier().size() == 2){	    		joinIdRename[1] = ctx.joinVar(1).identifier(0).getText();	    		joinId[1] = ctx.joinVar(1).identifier(1).getText();	    		names[1] = joinIdRename[1];	    	}	    	else{	    		joinIdRename[1] = null;	    		joinId[1] = ctx.joinVar(1).identifier(0).getText();	    		names[1] = joinId[1];	    	}	    		    	if(! idValueMap.containsKey(joinId[0])) throw new SemanticErrorException("variable "+joinId[0]+" undefined");	    	if(! idValueMap.containsKey(joinId[1])) throw new SemanticErrorException("variable "+joinId[1]+" undefined");	    	if(idValueMap.get(joinId[0]).dataType != DataType.RELATION || 	    			idValueMap.get(joinId[1]).dataType != DataType.RELATION){	    		throw new SemanticErrorException("join input type wrong, expecting relation type");	    	}	    	joinSchema[0] = idValueMap.get(joinId[0]).schema;	    	joinSchema[1] = idValueMap.get(joinId[1]).schema;	    	currentTree.left_input = idValueMap.get(joinId[0]);	    	currentTree.right_input = idValueMap.get(joinId[1]);	    		    	JsonExpression[] expr = new JsonExpression[2];	    	expr[0] = new ExprVisitor(false, names, joinSchema, currentOp).visit(ctx.var(0));	    	expr[1] = new ExprVisitor(false, names, joinSchema, currentOp).visit(ctx.var(1));	    	if(expr[0].attribute_source == expr[1].attribute_source)	    		throw new SemanticErrorException("duplicated relation attribute");	    		    	for(int i=0;i<2;i++){	    		if(expr[i].attribute_source == JsonAttrSource.left){	    			currentTree.left_join_attribute = expr[i].id_name;	    			joinLeftAttrExpr = expr[i];	    		}	    		else{	    			currentTree.right_join_attribute = expr[i].id_name;	    			joinRightAttrExpr = expr[i];	    		}	    	}		    	if(! joinLeftAttrExpr.retSchema.equals(joinRightAttrExpr.retSchema))	    		throw new SemanticErrorException("attribute type mismatch");		    	currentTree.projection = new ProjectionVisitor(false, names, joinSchema, currentOp).visit(ctx.jsonGen());	    	currentTree.schema = currentTree.projection.retSchema;				    	if(currentTree.schema.type != JsonValueType.OBJECT)		//TODO	    		throw new SemanticErrorException("currently not supported!");			return 0;	    }	@Override 	    public Integer visitPipe(JaqlGrammarParser.PipeContext ctx) {	    	if(currentTree != null) throw new SemanticErrorException("currenTree not empty in pipe");	    	String idName = ctx.identifier().getText();	    		    	//System.out.println("check id:" + idName);	    	if(! idValueMap.containsKey(idName)){	    		throw new SemanticErrorException("variable "+idName+" undefined");	    	}	    		    	currentTree = idValueMap.get(idName);	//    	currentSchema = idSchemaMap.get(idName);	    		    	for(int i=0;i<ctx.pipeExpr().size();i++){	    		prevSchema = currentTree.schema;	//   		currentSchema = null;	    		visit(ctx.pipeExpr(i));	    	}	    	return 0;	    }	@Override    public Integer visitGroupSingleLabel(JaqlGrammarParser.GroupSingleLabelContext ctx) {    	currentOp = OperationType.GROUP;    	if(ctx.gby == null)     		throw new SemanticErrorException("currently we do not support group w/o \"by\"");    	if(isStream(currentTree)){    		throw new SemanticErrorException("wrong input type: expecting relation type");    	}    	JsonQueryTree tmp = new JsonQueryTree();    	tmp.type = JsonOpType.groupby_aggregation;    	tmp.input = currentTree;    	currentTree = tmp;    	    	int startPos = 0;    	if(ctx.geach != null){    		haveRename = true;    		renameId = ctx.identifier(0).getText();    		startPos ++;    	}    	else {    		haveRename = false;    		renameId = null;    	}    	groupKeyVar = ctx.identifier(startPos).getText();//    	System.out.println("gkv = "+groupKeyVar);    	    	JsonExpression expr = new ExprVisitor(! haveRename, renameId, prevSchema).visit(ctx.var());    	currentTree.groupby_attribute_name = expr.id_name;		groupByAttrExpr = expr;				if(ctx.gas != null){			haveRename = true;			renameId = ctx.identifier(startPos+1).getText();		}		else {			haveRename = false;			renameId = null;		}				String[] tmpStrings;		JsonSchema[] tmpSchemas;		JsonSchema tmpSchema = new JsonSchema(JsonValueType.ARRAY);		tmpSchema.items = prevSchema;		tmpSchemas = new JsonSchema[]{groupByAttrExpr.retSchema, tmpSchema};		if(haveRename)			tmpStrings = new String[]{groupKeyVar,renameId};		else			tmpStrings = new String[]{groupKeyVar};		currentTree.projection = new ProjectionVisitor(! haveRename, tmpStrings, tmpSchemas, currentOp).visit(ctx.jsonGen());		currentTree.schema = currentTree.projection.retSchema;				if(currentTree.schema.type != JsonValueType.OBJECT)		//TODO    		throw new SemanticErrorException("currently not supported!");    	return 0;    }    //    @Override //    public Integer visitAggrExpr(JaqlGrammarParser.AggrExprContext ctx) {//    	if(ctx.aggrFunc() == null){//    		String tmpString;//    		JsonExpression expr = new ExprVisitor(true, groupKeyVar, groupByAttrExpr.retSchema).visit(ctx.varID());//    		//    		if(ctx.identifier() == null)//    			tmpString = expr.getLastIdName();//    		else{//    			tmpString = ctx.identifier().getText();//    		}//    		checkDuplication(tmpString);//			List<Object> tmpList = new ArrayList<Object>(currentTree.groupby_attribute_name);//			tmpList.addAll(expr.id_name);//			projectionIds.add(new JsonField(tmpList,tmpString));////    		currentSchema.nameToSchema.put(tmpString, groupByAttrExpr.retSchema);//    	}//    	else{//    		List<Object> tmpList = new ArrayList<Object>();//    		tmpList.add(ctx.identifier().getText());//    		projectionIds.add(new JsonField(tmpList));//    		if(currentTree.result_attribute_names == null){//    			currentTree.result_attribute_names = new ArrayList<String>();//    			currentTree.aggregate_operations = new ArrayList<String>();//    			currentTree.aggregation_attribute_names = new ArrayList<List<Object> >();//    		}//    		currentTree.result_attribute_names.add(ctx.identifier().getText());//    		visit(ctx.aggrFunc());//    		//    		int lastPos = currentTree.aggregate_operations.size()-1;//    		if(currentTree.aggregate_operations.get(lastPos).equals("count"))//    			currentSchema.nameToSchema.put(currentTree.result_attribute_names.get(lastPos), new JsonSchema(JsonValueType.INTEGER));//    		else{//    			currentSchema.nameToSchema.put(currentTree.result_attribute_names.get(lastPos), aggrAttrExpr.retSchema.items);//    		}//    	}//    	//    	return 0; //    }    //    @Override //    public Integer visitAggrFunc(JaqlGrammarParser.AggrFuncContext ctx) {//    	JsonSchema tmpSchema = new JsonSchema(JsonValueType.ARRAY);//    	tmpSchema.items = prevSchema;//    	//    	JsonExpression expr = new ExprVisitor(haveRename, renameId, tmpSchema).visit(ctx.var());//    	if(expr.retSchema.type != JsonValueType.ARRAY)	//first should be '[*]'//    		throw new SemanticErrorException("current not supported");//    	////		expr.id_name.remove(0);////		expr.retSchema = expr.retSchema.items;//    	aggrAttrExpr = expr;//    	currentTree.aggregation_attribute_names.add(aggrAttrExpr.id_name);//    	//    	switch (ctx.aggrFuncName().getText()) {//		case "sum"://			currentTree.aggregate_operations.add("sum");//			break;//		case "avg"://			currentTree.aggregate_operations.add("average");//			break;//		case "count"://			currentTree.aggregate_operations.add("count");//			break;//		case "min"://			currentTree.aggregate_operations.add("min");//			throw new SemanticErrorException("aggrFunc \"min\"currently not supported");//		case "max"://			currentTree.aggregate_operations.add("max");//			throw new SemanticErrorException("aggrFunc \"max\"currently not supported");//		default://			break;//		}//    	//    	if(ctx.aggrFuncName().getText().equals("sum") || ctx.aggrFuncName().getText().equals("avg")){//    		if(aggrAttrExpr.retSchema.items.type != JsonValueType.INTEGER && aggrAttrExpr.retSchema.items.type != JsonValueType.NUMBER)//    			throw new SemanticErrorException("aggregation of type: "+aggrAttrExpr.retSchema.items.type+" not supported");//    	}//    	//    	return 0; //    }        @Override    public Integer visitFilterLabel(JaqlGrammarParser.FilterLabelContext ctx) {    	currentOp = OperationType.FILTER;    	if(isStream(currentTree)){    		throw new SemanticErrorException("wrong input type: expecting relation type");    	}    	JsonQueryTree tmp = new JsonQueryTree();    	tmp.type = JsonOpType.selection;    	tmp.input = currentTree;    	currentTree = tmp;    	currentTree.schema = new JsonSchema(prevSchema);    	        haveRename = false;        renameId = null;        if(ctx.identifier() != null){        	haveRename = true;        	renameId = ctx.identifier().getText();        }                currentTree.selection_condition = new CondVisitor(! haveRename, renameId, prevSchema).visit(ctx.conditions());                return 0;    }        @Override    public Integer visitExpandLabel(JaqlGrammarParser.ExpandLabelContext ctx) {    	currentOp = OperationType.EXPAND;    	if(isStream(currentTree)){    		throw new SemanticErrorException("wrong input type: expecting relation type");    	}    	JsonQueryTree tmp = new JsonQueryTree();    	tmp.type = JsonOpType.expand;    	tmp.input = currentTree;    	currentTree = tmp;    	    	haveRename = false;    	renameId = null;    	if(ctx.identifier() != null){    		haveRename = true;    		renameId = ctx.identifier().getText();    	}    	    	if(ctx.jsonGen() == null){    		if(prevSchema.type != JsonValueType.ARRAY)    			throw new SemanticErrorException("expecting array input");    		JsonProjection tmpProj = new JsonProjection();    		tmpProj.type = JsonProjectionType.direct;    		tmpProj.expression = new JsonExpression();    		tmpProj.expression.type = "id";    		tmpProj.expression.id_name = new ArrayList<Object>();    		currentTree.projection = tmpProj;    		currentTree.schema = prevSchema.items;    	}    	else{    		JsonProjection tmpProj = new ProjectionVisitor(! haveRename, renameId, prevSchema).visit(ctx.jsonGen());    		if(tmpProj.retSchema.type != JsonValueType.ARRAY)    			throw new SemanticErrorException("expecting array input");    		currentTree.projection = tmpProj;    		currentTree.schema = tmpProj.retSchema.items;    	}    	    	if(currentTree.schema.items.type != JsonValueType.OBJECT)		//TODO    		throw new SemanticErrorException("currently not supported!");    	return 0;    }        @Override    public Integer visitTransformLabel(JaqlGrammarParser.TransformLabelContext ctx) {     	currentOp = OperationType.TRANS;    	if(isStream(currentTree)){    		throw new SemanticErrorException("wrong input type: expecting relation type");    	}    	JsonQueryTree tmp = new JsonQueryTree();    	tmp.type = JsonOpType.projection;    	tmp.input = currentTree;    	currentTree = tmp;    	    	haveRename = false;    	renameId = null;    	if(ctx.identifier() != null){    		haveRename = true;    		renameId = ctx.identifier().getText();    	}    	    	currentTree.projection = new ProjectionVisitor(! haveRename, renameId, prevSchema).visit(ctx.jsonGen());    	currentTree.schema = currentTree.projection.retSchema;    	    	if(currentTree.schema.type != JsonValueType.OBJECT)		//TODO    		throw new SemanticErrorException("currently not supported!");    	return 0;    }        @Override    public Integer visitStreamLabel(JaqlGrammarParser.StreamLabelContext ctx) {     	currentOp = OperationType.STREAM;    	if(isStream(currentTree)){    		throw new SemanticErrorException("wrong input type: expecting relation type");    	}    	JsonQueryTree tmp = new JsonQueryTree();    	switch (ctx.stream().getText()) {		case "istream":			tmp.type = JsonOpType.istream;			break;					case "rstream":			tmp.type = JsonOpType.rstream;			break;					case "dstream":			tmp.type = JsonOpType.dstream;			break;		default:			break;		}    	tmp.input = currentTree;    	currentTree = tmp;    	currentTree.schema = new JsonSchema(prevSchema);    	return 0;    }        @Override     public Integer visitWindowLabel(JaqlGrammarParser.WindowLabelContext ctx) {    	currentOp = OperationType.WINDOW;    	if(! isStream(currentTree)){    		throw new SemanticErrorException("wrong input type: expecting stream type");    	}    	JsonQueryTree tmp = new JsonQueryTree();    	tmp.input = currentTree;    	currentTree = tmp;    	currentTree.schema = new JsonSchema(prevSchema);    	    	return visit(ctx.windowRange());    	    }        @Override     public Integer visitWindowTimeLabel(JaqlGrammarParser.WindowTimeLabelContext ctx) {    	currentTree.type = JsonOpType.rangewindow;    	    	if(ctx.INT() == null){    		switch (ctx.timeRange().getText()) {			case "unbounded":				currentTree.windowsize = "unbounded";				break;			case "now":				currentTree.windowsize = "now";				break;			default:				break;			}    		    	}    	else{    		int timeQuan = Integer.parseInt(ctx.INT().getText());    		String timeUnit = ctx.timeUnit().getText();    		    		currentTree.windowsize = timeQuan + " " + timeUnit;    	}    	    	return 0;    	    }        @Override     public Integer visitWindowRowLabel(JaqlGrammarParser.WindowRowLabelContext ctx) {    	currentTree.type = JsonOpType.rowwindow;    	    	if(ctx.INT() == null) currentTree.windowsize = "unbounded";    	else{    		int size = Integer.parseInt(ctx.INT().getText());    		currentTree.windowsize = size;    	}    	    	return 0;    	    }        @Override     public Integer visitWindowPartitionLabel(JaqlGrammarParser.WindowPartitionLabelContext ctx) {    	currentTree.type = JsonOpType.partitionwindow;    	throw new SemanticErrorException(" partition window not supported yet");    	    	//return 0;    }        private boolean isStream(JsonQueryTree tree){    	if(tree.type == null){    		System.err.println("empty tree");    		return false;    	}    	    	return Constants.isStreamType(tree.type);    	    }//    //    private void checkDuplication(String id){//    	if(dupCheck.contains(id))//    		throw new SemanticErrorException("variable "+id+" duplicated");//    	else dupCheck.add(id);//    }//    //    private void checkAttrContaining(JsonSchema schema, String attrName){//    	if(! schema.nameToSchema.containsKey(attrName))//    		throw new SemanticErrorException("attribute name "+attrName+" is not valid.");//    }    }