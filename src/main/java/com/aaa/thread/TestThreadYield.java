package com.aaa.thread;

public class TestThreadYield {
	public volatile int inc = 0;
	public static Boolean f = false;

	public void increase() {
		inc++;
	}

	public Boolean getf() {
		return f;
	}

	public static void main(String[] args) throws InterruptedException {
		final TestThreadYield test = new TestThreadYield();
		Thread t = new Thread() {
			public void run() {
				for (int j = 0; j < 1000000000; j++) {
					test.increase();
					if (test.getf()) {
						break;
					}
				}
			};
		};
		t.start();
		Thread.sleep(1);
		Thread.yield();
		System.out.println(test.inc);
		//f = true;
		
		System.out.println(test.inc);
		while(t.isAlive())
		{
			
		}
		System.out.println(test.inc);
	}

}
