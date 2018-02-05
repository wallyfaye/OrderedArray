package com.wallyfaye.array;

/**
 * Ordered Array of Integers <br>
 * 
 * A wrapper for an ordered array of integers
 *
 * @version 1.0
*/

public class OrderedArray {

	private int[] array;
	private int length;

	/**
	* Constructor
	* 
	* @param s (required) the desired size of the array
	*/

	public OrderedArray(int s) {

		array = new int[s];
		length = array.length;

	}

	/**
	* Get the size of the array
	* 
	* @return the size of the array
	*/

	public int length() {

		return length;

	}


}