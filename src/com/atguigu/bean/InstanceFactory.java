package com.atguigu.bean;

import java.util.UUID;

public class InstanceFactory {
	public  Book getBook(){
		return new Book(UUID.randomUUID().toString().substring(0,5), 23);
	}
}
