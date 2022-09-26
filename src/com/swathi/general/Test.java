package com.swathi.general;

 class T {
	void test() {
		System.out.println("No Parameters");
	}
	//void test(int a) {
	//	System.out.println("a: "+a);
	//}
	void test(int a, int b) {
		System.out.println("a and b: " +a+ " "+b);
	}
	void test(double a) {
		System.out.println("double a: " +a);
	}
}
 class Test{
	public static void main(String args[]) {
		T t=new T();
		//double result;
		int i=88;
		t.test();
		//t.test(10);
		t.test(10,20);
		t.test(i);
		t.test(123.25);
		//System.out.println("Result of t.test(123.25): " +result);
	}
}