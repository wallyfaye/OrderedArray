package com.wallyfaye.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OrderedArrayTests {

	@Test
	void lengthOfArray() {
		int length = 128;
		OrderedArray array = new OrderedArray(length);
		assertEquals(length, array.length(), "first argument should set array size");
	}

}