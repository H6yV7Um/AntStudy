package com.weiyunsuan;

import org.junit.Test;

public class TestWeiYi {

	@Test
	public void test() {
		int a = -167772;
		System.out.println(a&0xffffff);
		System.out.println(Integer.toHexString(a));
		System.out.println(a);
		System.out.println((a & 0xff0000) >> 16);
		System.out.println((a & 0xff00) >> 8);
		System.out.println((a & 0xff));
		System.out.println();
		int b = (253 << 16) + (112 << 8) + 164;
		System.out.println(b);
		System.out.println((b & 0xff0000) >> 16);
		System.out.println((b & 0xff00) >> 8);
		System.out.println((b & 0xff));
		System.out.println(b);

		System.out.println();
		System.out.println(a & b);
		System.out.println(Integer.toHexString(b));
		int c = 0xffffff;
		System.out.println(c);
		System.out.println(Integer.decode("0xfd70a4"));
	}

}
