package com.str;

import org.junit.Test;

public class TestLast {

	@Test
	public void test() {
		 String aa="pdfasdfasdfasdfasdfasdf.pdf";
		 String suffix = aa.substring(aa.lastIndexOf(".") + 1);
		 System.out.println(suffix);
		 System.out.println(suffix.toLowerCase().equals("pdf"));
	}

}
