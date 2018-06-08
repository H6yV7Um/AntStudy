package com.aaa.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="File")
public class FileDownloadController {
	@RequestMapping(value = "download")
	public void downloadFile(String resourceId, HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String,String> resourceMap=new HashMap<String,String>();
		resourceMap.put("1", "风格识别.pdf");
		resourceMap.put("2", "单品匹配.pdf");
		resourceMap.put("3", "style-recog-samples.zip");
		resourceMap.put("4", "item-matching-samples.zip");
		resourceMap.put("5", "报名.doc");
		resourceMap.put("x", "npx.txt");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");	

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		String filePath = request.getServletContext().getRealPath("file")+File.separator+resourceMap.get(resourceId);
		long fileLength = new File(filePath).length();
		response.setHeader("Content-disposition", "attachment; filename=" + java.net.URLEncoder.encode(resourceMap.get(resourceId), "UTF-8"));
		response.setHeader("Content-Length", String.valueOf(fileLength));
		bis = new BufferedInputStream(new FileInputStream(filePath));
		bos = new BufferedOutputStream(response.getOutputStream());
		byte[] buff = new byte[2048];
		int bytesRead;
		while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
			bos.write(buff, 0, bytesRead);
		}
		bis.close();
		bos.close();
	}
}
