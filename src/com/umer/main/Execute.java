package com.umer.main;

import com.umer.fabonacci.FabonacciService;
import com.umer.factorial.FactorialService;

public class Execute {

	public static void main(String[] args) {
		FactorialService factorial = new FactorialService();
		System.out.println(factorial.calculateFactorial(10));

		FabonacciService fabonacci = new FabonacciService();
		System.out.println(fabonacci.calculateFabonacci(10));

	}

}
