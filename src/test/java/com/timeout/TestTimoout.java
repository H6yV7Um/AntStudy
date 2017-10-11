package com.timeout;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.junit.Test;

public class TestTimoout {

	@Test
	public void test() {
		String result = "aaa";
		ExecutorService executor = Executors.newSingleThreadExecutor();
		FutureTask<String> future = new FutureTask<String>(new Callable<String>() {// 使用Callable接口作为构造参数
			public String call() {
				// 真正的任务在这里执行，这里的返回值类型为String，可以为任意类型
				for(int i=0;i<1000000;i++){
					System.out.println(i);
				}
				return "aaaa";
			}
		});
		executor.execute(future);
		// 在这里可以做别的任何事情
		try {
			result = future.get(1000, TimeUnit.MILLISECONDS); // 取得结果，同时设置超时执行时间为5秒。同样可以用future.get()，不设置执行超时时间取得结果
		} catch (InterruptedException e) {
			future.cancel(true);
		} catch (ExecutionException e) {
			future.cancel(true);
		} catch (TimeoutException e) {
			future.cancel(true);
		} finally {
			executor.shutdown();
			System.out.println(result);
		}
		System.out.println("finish");

	}

}
