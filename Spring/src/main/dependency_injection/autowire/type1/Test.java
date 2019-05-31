package main.dependency_injection.autowire.type1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("type1.xml");
		//သူ႕ရဲ႕ ကိုယ္ပိုင္ object ကို return ၿပန္ေပးလိုက္တယ္
		A a = (A) context.getBean("a");
		a.msg();
	}
}
