package main.dependency_injection.autowire.simple_autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiredTest.xml");
		A a = context.getBean("a", A.class);
		a.display();
	}
}
