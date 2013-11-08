package test;


import com.google.gson.Gson;

public class GsonTest {
	
	static class TestJsonType {
		String name1;
		int integ1;
		TestJsonType nest = null;
		public TestJsonType(String name, int inte, TestJsonType ne){
			name1 = name;
			integ1 = inte;
			nest = ne;
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJsonType tin = new TestJsonType("tin", 0, null);
		TestJsonType tout = new TestJsonType("tout", 1, tin);
		Gson gson = new Gson();
		System.out.println(gson.toJson(tout));
	}

	
}
