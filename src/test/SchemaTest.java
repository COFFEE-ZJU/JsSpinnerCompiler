package test;

import java.io.File;
import java.io.FileInputStream;
import others.JsonSchema;

import com.google.gson.Gson;

public class SchemaTest {
	public void test(){
		File file = new File("testSchema.txt");
		Long fileLengthLong = file.length();
		byte[] fileContent = new byte[fileLengthLong.intValue()];
		try {
		        FileInputStream inputStream = new FileInputStream(file);
		        inputStream.read(fileContent);
		        inputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		String schema = new String(fileContent);
		System.out.println(schema);
		//System.out.println(api);
		JsonSchema js = new Gson().fromJson(schema, JsonSchema.class);
		
		System.out.println(new Gson().toJson(js));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SchemaTest().test();

	}

}
