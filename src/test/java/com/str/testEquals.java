package com.str;

import org.junit.Test;

public class testEquals {

	@Test
	public void test() {
		String aa="aa";
		String bb=null;
		Object obj=new String("aa");
		System.out.println(aa.equals("aa"));
		System.out.println("aa".equals(bb));
		System.out.println(obj.equals("aa"));
	}
	
	@Test
	public void test1(){
		String b="aa,bb,cc,dd";
		System.out.println((b+",").indexOf("cb"));
	}

}
