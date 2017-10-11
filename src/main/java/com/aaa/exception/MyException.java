package com.aaa.exception;

import java.util.concurrent.TimeoutException;

import org.apache.hadoop.hbase.NotServingRegionException;

public class MyException {
	public int testException() throws TimeoutException {
		int a = 0;
		int b = 100;
		int c = 1;
		try {
			throw new NotServingRegionException();
		} catch (NotServingRegionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
}
