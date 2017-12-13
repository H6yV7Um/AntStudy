package com.pinyin;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class TestGupiao2Pinyin {

	@Test
	public void test() {
		try {
			String outFileName = "D:\\Develop\\file_text\\gupiaoandpinyin.txt";
			File file = new File("D:\\Develop\\file_text\\gupiao.txt");
			String encoding = "UTF-8";
			HanyuPinyinOutputFormat outputFormat = new HanyuPinyinOutputFormat();
			outputFormat.setToneType(HanyuPinyinToneType.WITH_TONE_NUMBER);// 设置音调格式
			outputFormat.setVCharType(HanyuPinyinVCharType.WITH_V);// 设置ü的格式
			outputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);// 设置大小写
			InputStreamReader readtypes = new InputStreamReader(new FileInputStream(file), encoding);
			BufferedReader bufferedReader = new BufferedReader(readtypes);
			String lineTxt = null;
			System.out.println("start");
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File(outFileName)));
			while ((lineTxt = bufferedReader.readLine()) != null) {
				char[] strarray = lineTxt.trim().replaceAll(" ", "").toCharArray();
				StringBuilder jianpin = new StringBuilder();
				StringBuilder quanpin = new StringBuilder();
				StringBuilder sjianpin = new StringBuilder();
				StringBuilder squanpin = new StringBuilder();
				for (int j = 0; j < strarray.length; j++) {
					try {
						sjianpin = new StringBuilder();
						squanpin = new StringBuilder();
						String[] s1 = PinyinHelper.toHanyuPinyinStringArray(strarray[j], outputFormat);
						if (s1.length > 1) {
							sjianpin.append("(");
							squanpin.append("(");
						}
						for (int i = 0; i < s1.length; i++) {
							sjianpin.append(s1[i].substring(0, 1));
							squanpin.append(s1[i]);
							if (i + 1 < s1.length) {
								sjianpin.append(",");
								squanpin.append(",");
							}
						}
						if (s1.length > 1) {
							sjianpin.append(")");
							squanpin.append(")");
						}
					} catch (BadHanyuPinyinOutputFormatCombination e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (j + 1 < strarray.length) {
						jianpin.append(sjianpin.append(","));
						quanpin.append(squanpin.append(","));
					} else {
						jianpin.append(sjianpin);
						quanpin.append(squanpin);
					}
				}
				writer.write(lineTxt + "~" + jianpin.toString() + "~" + quanpin.toString() + "\r");
			}
			writer.close();
			bufferedReader.close();
			System.out.println("finish");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
