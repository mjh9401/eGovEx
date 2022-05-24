package com.mvst.edu.Ut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectUsingAnnotation {
	
	@Pointcut("execution(* com.mvst.edu.controller.MemberController.memSearch(*))")
	public void targetMethod() {}
	
	@Before("targetMethod()")
	public void testMethod() {
		System.out.println("안녕하세요");
	}
}
