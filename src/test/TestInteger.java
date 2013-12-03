package test;

public class TestInteger {
	public static void main(String[] args) {
		int num1 = 1;
		Integer num2 = 1;
		test(num1);
		test(num2);
		System.out.println(num1);
		System.out.println(num2);
	}
	public static void test(Integer num){
		num++;
	}
	public static void test(int num){
		num++;
	}
}
