package com.exceptions;

import java.util.concurrent.TimeoutException;

import org.junit.Test;

import com.aaa.exception.MyException1;

public class TestException {

	@Test
	public void test() {
		MyException1 me=new MyException1();
		try {
			me.testMyexception1();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
