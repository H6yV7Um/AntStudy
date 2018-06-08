package com.host;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Test;

public class TestGetLocalIp {

	@Test
	public void test() throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.toString());
	}

}
