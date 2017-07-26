package com.atguigu.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	@org.junit.Test
	public void Test(){
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		Object bean1 = ioc.getBean("student101");
		Object bean2 = ioc.getBean("student101");
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean1==bean2);
		Object bean3 = ioc.getBean("student000");
		Object bean4 = ioc.getBean("student000");
		System.out.println(bean3);
		System.out.println(bean4);
	}
}
