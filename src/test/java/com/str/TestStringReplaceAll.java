package com.str;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class TestStringReplaceAll {

	@Test
	public void test() throws IOException {
		File file = new File("D:\\myfile\\war\\email.txt");
		String encoding = "UTF-8";

		InputStreamReader readtypes = new InputStreamReader(new FileInputStream(file), encoding);
		BufferedReader bufferedReader = new BufferedReader(readtypes);
		String lineTxt = null;
		String htmlTxt="";
		while ((lineTxt = bufferedReader.readLine()) != null) {
			htmlTxt+=lineTxt;
		}
		System.out.println(htmlTxt.replaceAll("userName", "aa"));
		bufferedReader.close();
	}

}
