package com.map;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestMap {

	@Test
	public void test() {
		Map<String,String> map=new HashMap<String,String>();
		map.put("aa", "s");
		map.put("bb", "ss");
		System.out.println(map.size());
		System.out.println(map.get("aa"));
	}

}
