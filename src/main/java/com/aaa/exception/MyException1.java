package com.aaa.exception;

import java.util.concurrent.TimeoutException;

public class MyException1 {
public int testMyexception1() throws TimeoutException{
	MyException my=new MyException();
	return my.testException();
}
}
