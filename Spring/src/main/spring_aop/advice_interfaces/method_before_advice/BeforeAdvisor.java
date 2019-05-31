package main.spring_aop.advice_interfaces.method_before_advice;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice{
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("additional concern before actual logic");
	}
}
