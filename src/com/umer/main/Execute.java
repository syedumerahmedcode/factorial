package com.umer.main;

import com.umer.fabonacci.FabonacciService;
import com.umer.factorial.FactorialService;
import com.umer.power.PowerCalculationService;
import com.umer.sumofdigits.SumOfDigitsService;

public class Execute {

	public static void main(String[] args) {
		FactorialService factorial = new FactorialService();
		System.out.println(factorial.calculateFactorial(10));

		FabonacciService fabonacci = new FabonacciService();
		System.out.println(fabonacci.calculateFabonacci(10));

		SumOfDigitsService sumOfDigitsService = new SumOfDigitsService();
		System.out.println(sumOfDigitsService.calculateSumOfDigits(134));

		PowerCalculationService powerCalculationService = new PowerCalculationService();
		System.out.println(powerCalculationService.calculatePower(4, 5));

	}

}
