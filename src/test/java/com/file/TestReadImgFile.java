package com.file;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import org.junit.Test;

public class TestReadImgFile {

	@Test
	public void test() {
		File file=new File("D:\\Develop\\file_face\\aaa.jpg");
		byte[] b=null;
		try {
			BufferedImage bi=ImageIO.read(new ByteArrayInputStream(b));
			
			System.out.println(bi.getHeight());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
