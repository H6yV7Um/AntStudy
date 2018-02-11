package com.uuid;

import java.util.UUID;

import org.junit.Test;

public class TestGenUUID {

	@Test
	public void test() {
		UUID uuid=UUID.nameUUIDFromBytes("bjbianwenxing".getBytes());
		System.out.println(uuid.toString());
	}
}
