package com.atguigu.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.atguigu.bean.Book;
import com.atguigu.bean.Person;
import com.atguigu.bean.Student;

public class PersonTest {
	public ApplicationContext ioc=new ClassPathXmlApplicationContext("bean.xml");
	@Test
	public void test1() {
		Person person = (Person) ioc.getBean("person01");
		//Person bean = applicationContext.getBean(Person.class);
		//System.out.println(bean);
		System.out.println(person);
		
		Student student = (Student) ioc.getBean("student01");
		System.out.println(student);
	}
	@Test
	public void test2(){
		Object bean = ioc.getBean("mybook");
		Object bean2 = ioc.getBean("mybook");
		Object bean3 = ioc.getBean("mybook");
		System.out.println(bean);
		System.out.println(bean2);
		System.out.println(bean3);
	}
	@Test
	public void test3(){
		Object bean = ioc.getBean("mybook001");
		Object bean1 = ioc.getBean("mybook001");
		Object bean2 = ioc.getBean("mybook001");
		System.out.println(bean1);
		System.out.println(bean);
		System.out.println(bean2);
	}
	
	@Test
	public void test4(){
		Object bean = ioc.getBean("mybook002");
		Object bean1 = ioc.getBean("mybook002");
		Object bean2 = ioc.getBean("mybook002");
		System.out.println(bean1);
		System.out.println(bean);
		System.out.println(bean2);
	}
	
}
