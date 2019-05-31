package main.dependency_injection.autowire.type2;

public class PrintableFactory {
	//ဒါက factory method 
	public static Printable getPrintable() {
		// return new B();
		return new A();// return any one instance, either A or B
	}
}
