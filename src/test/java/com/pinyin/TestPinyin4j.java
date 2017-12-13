package com.pinyin;

import org.junit.Test;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class TestPinyin4j {

	@Test
	public void test() {
		long st=System.currentTimeMillis();
		HanyuPinyinOutputFormat outputFormat = new HanyuPinyinOutputFormat();
		outputFormat.setToneType(HanyuPinyinToneType.WITH_TONE_NUMBER);//设置音调格式
		outputFormat.setVCharType(HanyuPinyinVCharType.WITH_V);//设置ü的格式
		outputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);//设置大小写
		try {
			String[] s1 = PinyinHelper.toHanyuPinyinStringArray('重', outputFormat);
			for(String s:s1){
				System.out.println(s);
			}
			System.out.println(System.currentTimeMillis()-st);
		} catch (BadHanyuPinyinOutputFormatCombination e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
