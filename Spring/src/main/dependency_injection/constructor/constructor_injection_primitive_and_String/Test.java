package main.dependency_injection.constructor.constructor_injection_primitive_and_String;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		// for int constructor
		Employee employee = (Employee) factory.getBean("intConstructorDenpendencyInjection");
		employee.show();

		// for string constructor
		Employee employee1 = (Employee) factory.getBean("stringConstructorDenpendencyInjection");
		employee1.show();

		// for string constructor
		Employee employee2 = (Employee) factory.getBean("string2ConstructorDenpendencyInjection");
		employee2.show();

		// for argument(both) constructor
		Employee employee3 = (Employee) factory.getBean("bothConstructorDenpendencyInjection");
		employee3.show();
	}
}
