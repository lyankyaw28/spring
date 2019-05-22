package main.dependency_injection.setter.setter_injection_primitive_and_string;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee e = (Employee) factory.getBean("setterDIPrimitiveString");
		e.display();

	}
}
