package main.dependency_injection.constructor.constructor_injection_inheriting_bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee e1 = (Employee) factory.getBean("employeeInheritingBean2");
		e1.show();
	}
}
