package com.math;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

import org.junit.Test;

public class testMeisengsushu {

	@Test
	public void test() {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("d:\\ss.txt")));
			BigInteger bi=new BigInteger("2");
			Integer exp=77232917;
			bi=bi.pow(exp);
			//System.out.println(bi.toString());
			writer.write(bi.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
