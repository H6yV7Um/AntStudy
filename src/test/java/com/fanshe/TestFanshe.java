package com.fanshe;

import java.lang.reflect.Method;
import java.util.Map;

import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestFanshe {

	@Test
	public void test() throws Exception {
		Object cls = Class.forName("com.aaa.fanshe.TestFanshe").newInstance();
		Method[] m = cls.getClass().getMethods();
		Method meth = cls.getClass().getMethod("GenStr", String.class, Integer.class, Map.class);
		Object[] obj = new Object[2];
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("new Object[]{'aaaa',12,{'aa':'aaz','ss':'ssz'}}");
		// obj[0] = "aaaa";
		// obj[1] = new Integer(11);
		obj = exp.getValue(Object[].class);
		String msg = (String) meth.invoke(cls, obj);
		System.out.println(msg);
		System.out.println();
		for (Method sm : m) {
			System.out.println(sm.getName());
			for (Class<?> c : sm.getParameterTypes()) {
				System.out.println(c.getName());
			}
		}
	}
}
