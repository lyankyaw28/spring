package main.dependency_injection.autowire.type1;

public class A {
	private static final A obj = new A();
	
	// ဘာပဲလုပ္လုပ္ default constructor အရင္စလုပ္
	private A() {
		System.out.println("private constructor");
	}

	//that is factory method
	public static A getA() {
		System.out.println("factory method ");
		return obj;
	}

	public void msg() {
		System.out.println("hello user");
	}
}
