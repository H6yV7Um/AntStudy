package com.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class TestSet {

	@Test
	public void test() {
		Set<String> strSet=new TreeSet<String>();
		for(int i=0;i<10;i++){
			strSet.add(i+"aaa");
		}
		Iterator<String> it=strSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
