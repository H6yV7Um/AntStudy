package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;

public class testFileMove {

	@Test
	public void test() {
		File file = new File("E:\\myfile\\timg.jpg");
		//file.renameTo(new File("E:\\timg.jpg"));
		System.out.println(new File(file.getParent()).getParent());
		System.out.println(file.getName());
	}

}
