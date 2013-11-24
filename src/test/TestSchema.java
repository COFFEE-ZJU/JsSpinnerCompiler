package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class TestSchema
{
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException{
		
		Object o = new Gson().fromJson(new FileReader("twitterWrapper.txt"), Object.class);
		Map<String, Object> map = (Map<String, Object>)o;
		o = map.get("information_source_schema");
		map = (Map<String, Object>)o;
		o = map.get("properties");
		map = (Map<String, Object>)o;
		
		Map<String, String> res = new HashMap<String, String>();
		Iterator<Entry<String, Object> > it = map.entrySet().iterator();
		Entry<String, Object> ent;
		Map<String, String> sMap;
		while(it.hasNext()){
			ent = it.next();
			System.out.println(ent.getKey());
			sMap = (Map<String, String>)ent.getValue();
			res.put(ent.getKey(), sMap.get("type"));
		}
		
		System.out.println(res);
	}
}
