package com.umer.productofanarray;

public class ProductOfAnArrayService {

	public int productofArray(int arrayOfnumbers[], int number) {
		// Exit condition
		if (number <= 0) {
			return 1;
		}
		// recursive flow
		return (productofArray(arrayOfnumbers, number - 1) * arrayOfnumbers[number - 1]);
	}

}
