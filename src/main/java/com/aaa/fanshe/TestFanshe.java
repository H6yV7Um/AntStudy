package com.aaa.fanshe;

import java.util.Map;

public class TestFanshe {
	public String GenStr(String msg, Integer a, Map<String, String> p) {
		for (String s : p.keySet()) {
			System.out.println(p.get(s));
		}
		return "GenStr msg:" + msg + "====" + a;
	}
}
