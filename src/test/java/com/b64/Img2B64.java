package com.b64;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

public class Img2B64 {

	@Test
	public void test() {
		// TODO Auto-generated method stub
		String filepath="E:\\mytemp\\OCR审核badcase9.22-9.28\\OCR识别错误badcase-原图\\1.jpg";
		try {
			FileInputStream fis=new FileInputStream(filepath);
			byte[] date=new byte[fis.available()];
			fis.read(date);
			fis.close();
			Base64 base64 = new Base64();
			String fileb64 = base64.encodeAsString(date);
			System.out.println("finish");
			System.out.println(fileb64);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
