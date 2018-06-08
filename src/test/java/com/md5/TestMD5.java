package com.md5;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

public class TestMD5 {

	@Test
	public void test() throws NoSuchAlgorithmException, IOException {
		FileInputStream fis = new FileInputStream("D:\\bitmap.bmp");
		byte[] date = new byte[fis.available()];
		fis.read(date);
		fis.close();
		String str = Base64.encodeBase64String(date);
		System.out.println(str.length());
		MessageDigest md5 = MessageDigest.getInstance("MD5");  
		Base64 base64 = new Base64();
        // 加密后的字符串，注意一定要自己指定编码，否则会取系统默认。不同系统会不一致。  
        System.out.println(base64.encodeToString(md5.digest(str.getBytes("utf-8"))));
        str=str+"4f9a00d2-5eaf-4c36-8991-f7deaa39a9d8";
        System.out.println(base64.encodeToString(md5.digest(str.getBytes("utf-8"))));
        System.out.println(base64.encodeToString(md5.digest(str.getBytes("utf-8"))));
	}

}
