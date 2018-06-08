package com.math;

import java.math.BigInteger;

import org.junit.Test;

public class TestJiecheng {

	@Test
	public void test() {
		BigInteger bi=new BigInteger("1");
		for(Integer i=1;i<14;i++){
			bi=bi.multiply(new BigInteger(i.toString()));
			System.out.println(i);
		}
		System.out.println(bi.toString());
		System.out.println(bi.divide(new BigInteger("864000")));
	}

}
