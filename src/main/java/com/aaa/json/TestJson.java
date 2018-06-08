package com.aaa.json;

import static org.junit.Assert.*;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class TestJson {

	@Test
	public void test() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		for(int i=0;i<100;i++){
			Aa a=new Aa();
			a.setAa("ss"+i);
			a.setBb("bb"+i);
			System.out.println(mapper.writeValueAsString(a));
		}
	}

}

class Aa{
	private String aa;
	private String bb;
	public String getAa() {
		return aa;
	}
	public void setAa(String aa) {
		this.aa = aa;
	}
	public String getBb() {
		return bb;
	}
	public void setBb(String bb) {
		this.bb = bb;
	}
	
}
