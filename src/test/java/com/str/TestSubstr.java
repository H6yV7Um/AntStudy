package com.str;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSubstr {

	
	public void test() {
		String stock="600988|赤峰黄金";
		System.out.println(stock.substring(0, stock.indexOf("|")));
	}
	
	@Test
	public void test1(){
		String stock="abcdefdg";
		System.out.println(stock.substring(0, stock.lastIndexOf("d")+1));
	}
	
	@Test
	public void test2(){
		for(int i=0;i<4;i++){
			System.out.println("aa"+i);
		}
	}

}
