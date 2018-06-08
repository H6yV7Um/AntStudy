package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class TestList {
	int a;
	Integer b;
	String c;
	
	@Test
	public void test() {
		List<String> listStr=new ArrayList<String>();
		listStr.add("aa");
		listStr.add("bb");
		Iterator<String> i=listStr.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
