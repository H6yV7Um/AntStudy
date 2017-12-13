package com.str;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSubstr {

	@Test
	public void test() {
		String stock="600988|赤峰黄金";
		System.out.println(stock.substring(0, stock.indexOf("|")));
	}

}
