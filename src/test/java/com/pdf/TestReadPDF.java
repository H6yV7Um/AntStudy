package com.pdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.junit.Test;

public class TestReadPDF {

	@Test
	public void test() {
		File file = new File("E:\\项目\\面试\\简历\\算法\\");
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				// System.out.println(f.getAbsolutePath());
				readPDF(f);
			}
		}

	}

	public static String readPDF(File f) {
		String result = null;
		FileInputStream is = null;
		PDDocument document = null;
		try {
			is = new FileInputStream(f);
			PDFParser parser = new PDFParser(is);
			parser.parse();
			document = parser.getPDDocument();
			PDFTextStripper stripper = new PDFTextStripper();
			result = stripper.getText(document);
			String lastresult = result.substring(0, result.indexOf("工作描述"));
			if (lastresult.indexOf("北京") > -1) {
				f.renameTo(new File(new File(f.getParent()).getParent()+"\\temp1\\"+f.getName()));
				System.out.println(f.getName());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (document != null) {
				try {
					document.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

}
