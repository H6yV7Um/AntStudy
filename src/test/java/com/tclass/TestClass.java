package com.tclass;

import org.junit.Test;

public class TestClass {

	@Test
	public void test() {
		String name=IntegerToAny(String.class).toString();
		System.out.println(name);
	}
	
	public Object IntegerToAny(Object a){
		return a;
	}

}
