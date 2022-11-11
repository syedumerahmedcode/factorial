package com.umer.main;

import java.util.Arrays;

import com.umer.decimaltobinary.DecimnalToBinaryConverterService;
import com.umer.fabonacci.FabonacciService;
import com.umer.factorial.FactorialService;
import com.umer.gcd.GCDService;
import com.umer.power.PowerCalculationService;
import com.umer.productofanarray.ProductOfAnArrayService;
import com.umer.recursiverange.RecursiveRangeService;
import com.umer.reversestring.ReverseStringService;
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

		DecimnalToBinaryConverterService decimnalToBinaryConverterService = new DecimnalToBinaryConverterService();
		final int numberToConvertInBinary = 10;
		System.out.println("Finding the binary equivalent for " + numberToConvertInBinary);
		System.out.println(decimnalToBinaryConverterService.convertDecimalToBinary(numberToConvertInBinary));
		System.out.println();

		ProductOfAnArrayService productOfAnArrayService = new ProductOfAnArrayService();
		int arrayOfnumbers[] = { 1, 2, 3, 4, 5 };
		int initialnumber = 0;
		System.out.println("Finding the product of the array provided: " + Arrays.toString(arrayOfnumbers));
		System.out.println(productOfAnArrayService.productofArray(arrayOfnumbers, initialnumber));
		System.out.println();

		RecursiveRangeService recursiveRangeService = new RecursiveRangeService();
		int inputForRecursiveRange = 20;
		System.out.println("Finding the recursive sum (recursive range) for " + inputForRecursiveRange);
		System.out.println(recursiveRangeService.calculateRecursiveSum(inputForRecursiveRange));
		System.out.println();
		
		ReverseStringService reverseStringService=new ReverseStringService();
		final String stringToReverse = "java";
		System.out.println("Finding the reverse of the string provided: "+stringToReverse);
		System.out.println(reverseStringService.reverseString(stringToReverse));
		System.out.println();

	}

}
