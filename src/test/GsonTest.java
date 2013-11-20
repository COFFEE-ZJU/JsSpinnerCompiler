package test;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

public class GsonTest {
	
	static class TestJsonType {
		@Expose String name1;
		@Expose int integ1;
		@Expose TestJsonType nest = null;
		public TestJsonType(String name, int inte, TestJsonType ne){
			name1 = name;
			integ1 = inte;
			nest = ne;
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJsonType tin = new TestJsonType("tin", 0, null);
		TestJsonType tout = new TestJsonType(null, 1, tin);
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		System.out.println(gson.toJson(tout));
	}

	
}
