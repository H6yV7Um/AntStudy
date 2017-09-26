package com.deque;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

import org.junit.Test;

public class Deque {
	@Test
	public void test() {
		LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<String>(10000);
		System.out.println(deque.size());
		for (int i = 0; i < 10; i++) {
			deque.add("aaaa" + i);
		}
		System.out.println(deque.size());
		String msg = null;
		Boolean flag = true;
		while (deque.size() > 0 && flag) {
			try {
				System.out.println(deque.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void test1() throws InterruptedException {
		List<String> strList = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new AddStr("sss" + i, strList));
			t.start();
		}
		Thread.sleep(1000);
		for (String str : strList) {
			System.out.println(str);
		}

	}

	private class AddStr implements Runnable {
		private String str;
		private List<String> strList;

		public AddStr(String str, List<String> strList) {
			super();
			this.str = str;
			this.strList = strList;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			strList.add(str);
		}
	}

	private class GetStr implements Runnable {
		private List<String> strList;

		public GetStr(List<String> strList) {
			super();
			this.strList = strList;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub

			System.out.println();
		}
	}

}
