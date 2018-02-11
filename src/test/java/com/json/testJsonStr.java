package com.json;

import static org.junit.Assert.*;

import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class testJsonStr {

	@Test
	public void test() {
		ObjectMapper mapper = new ObjectMapper();
		String json="{\"token\":\"aaaa\",\"ip\":\"bbbb\",\"type\":1}";
		try {
			JsonNode jn=mapper.readTree(json);
			System.out.println(jn.get("ip").getTextValue());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
