package main.dependency_injection.autowire.simple_autowire;

public class B {
	B() {
		System.out.println("b is created");
	}

	void print() {
		System.out.println("hello b");
	}
}
