package com.umer.recursiverange;

public class RecursiveRangeService {

	public int calculateRecursiveSum(int number) {
		// checking constraint
		// Exit condition
		if (number <= 0) {
			return 0;
		}
		// recursive flow
		return number + calculateRecursiveSum(number - 1);
	}

}
