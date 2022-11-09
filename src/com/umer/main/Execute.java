package com.umer.main;

import com.umer.fabonacci.FabonacciService;
import com.umer.factorial.FactorialService;
import com.umer.gcd.GCDService;
import com.umer.power.PowerCalculationService;
import com.umer.sumofdigits.SumOfDigitsService;

public class Execute {

	public static void main(String[] args) {
		FactorialService factorial = new FactorialService();
		final int inputForFactorial = 10;
		System.out.println("Finding the factorial for: " + inputForFactorial);
		System.out.println(factorial.calculateFactorial(inputForFactorial));
		System.out.println();

		FabonacciService fabonacci = new FabonacciService();
		final int inputForFabonacci = 10;
		System.out.println("Finding the Fabonacci for: " + inputForFabonacci);
		System.out.println(fabonacci.calculateFabonacci(inputForFabonacci));
		System.out.println();

		SumOfDigitsService sumOfDigitsService = new SumOfDigitsService();
		final int inputForSumOfDigits = 134;
		System.out.println("Finding the sum of digits for :" + inputForSumOfDigits);
		System.out.println(sumOfDigitsService.calculateSumOfDigits(inputForSumOfDigits));
		System.out.println();

		PowerCalculationService powerCalculationService = new PowerCalculationService();
		final int inputForBase = 4;
		final int inputForExponent = 5;
		System.out.println("Finding the power for " + inputForBase + " base and " + inputForExponent + " exponent.");
		System.out.println(powerCalculationService.calculatePower(inputForBase, inputForExponent));
		System.out.println();

		GCDService gcdService = new GCDService();
		final int inputForFirstNumber = 48;
		final int inputForSecondNumber = 18;
		System.out.println("Finding the GCD for " + inputForFirstNumber + " and " + inputForSecondNumber
				+ " using Euclidean algorithm.");
		System.out.println(gcdService.calculateGCD(inputForFirstNumber, inputForSecondNumber));
		System.out.println();

	}

}
