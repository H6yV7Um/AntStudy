package com.function;

import java.util.Scanner;

import org.junit.Test;

public class TestFunPer {

	@Test
	public void test() {
		aa a=new aa();
		System.out.println("please input something");
		Scanner xx = new Scanner(System.in);
		String instr=xx.nextLine();
		change(a,instr);
		System.out.println(a.getBb());
	}
	
	public void change(aa a,String bb){
		a.setBb(bb);
	}
	
	private class aa{
		private String bb;

		public String getBb() {
			return bb;
		}

		public void setBb(String bb) {
			this.bb = bb;
		}
		
	}

}
