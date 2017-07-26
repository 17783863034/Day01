package com.atguigu.bean;

import java.util.UUID;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryImpl implements FactoryBean<Book> {

	@Override
	public Book getObject() throws Exception {	
		return new Book(UUID.randomUUID().toString().substring(0,6), 88.8);
	}

	@Override
	public Class<?> getObjectType() {
		return Book.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
