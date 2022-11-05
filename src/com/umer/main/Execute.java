package com.umer.main;

import com.umer.fabonacci.Fabonacci;
import com.umer.factorial.Factorial;

public class Execute {

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println(factorial.factorial(10));

		Fabonacci fabonacci = new Fabonacci();
		System.out.println(fabonacci.fabonacci(10));

	}

}
