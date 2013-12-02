package test;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

public class GsonTest {
	
	static class TestJsonType {
		@Expose String name1;
		@Expose List<Object> lists;
		@Expose TestJsonType nest = null;
		public TestJsonType(String name, List<Object> lists, TestJsonType ne){
			name1 = name;
			this.lists = lists;
			nest = ne;
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestJsonType tin = new TestJsonType("tin", 0, null);
		//TestJsonType tout = new TestJsonType(null, 1, tin);
		TestJsonType tt = new TestJsonType("name", null, null);
		tt.lists = new ArrayList<Object>();
		tt.lists.add("a string");
		tt.lists.add(34);
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		System.out.println(gson.toJson(tt));
	}

	
}
