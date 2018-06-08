package com.header;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.junit.Test;

public class TestHeader {

	@Test
	public void test() throws ClientProtocolException, IOException, URISyntaxException {
		 HttpClient client = new DefaultHttpClient();    
         // 实例化HTTP方法    
         HttpPost request = new HttpPost();    
         request.setURI(new URI("http://127.0.0.1:8080/as/Header/requestHeader"));  
           
         //设置参数  
         List<NameValuePair> nvps = new ArrayList<NameValuePair>();   
             nvps.add(new BasicNameValuePair("name", "myname"));  
         request.setEntity(new UrlEncodedFormEntity(nvps,HTTP.UTF_8));  
           
         HttpResponse response = client.execute(request);    
         System.out.println(response);
	}
	
	@Test
	public void test1(){
		PostMethod post = new PostMethod("http://127.0.0.1:8080/as/Header/requestHeader");
		Header header=new Header();
		header.setName("key");
		header.setValue("mykey");
		post.addRequestHeader(header);

        try {
			InputStream in = post.getResponseBodyAsStream();
			System.out.println(new String(in.toString()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
