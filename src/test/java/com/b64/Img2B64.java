package com.b64;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

public class Img2B64 {

	@Test
	public void test() {
		// TODO Auto-generated method stub
		String filepath = "E:\\mytemp\\OCR审核badcase9.22-9.28\\OCR识别错误badcase-原图\\1.jpg";
		try {
			FileInputStream fis = new FileInputStream(filepath);
			byte[] date = new byte[fis.available()];
			fis.read(date);
			fis.close();
			String fileb64 = Base64.encodeBase64String(date);
			System.out.println("finish");
			System.out.println(fileb64);
			System.out.println("-----------");
			byte[] b = Base64.decodeBase64(fileb64);
			for (int i = 0; i < b.length; i++) {
				//System.out.println(b[i]);
				if (b[i] < 0) {
					System.out.println(b[i]);
					b[i] += 256;
					System.out.println(b[i]);
				}
			}
			FileOutputStream fos = new FileOutputStream(new File("d:\\a.jpg"));
			fos.write(b);
			fos.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
