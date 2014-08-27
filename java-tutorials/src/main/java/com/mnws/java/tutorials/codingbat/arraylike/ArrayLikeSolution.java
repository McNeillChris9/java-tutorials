package com.mnws.java.tutorials.codingbat.arraylike;

public class ArrayLikeSolution implements ArrayLike {

	@Override
	public boolean arrayLike(int[] nums, int value) {
		int inRange = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] >= value - 2) && (nums[i] <= value + 2)) {
				inRange++;
			}
		}
		return (inRange >= (nums.length + 1) / 2);
	}

}
