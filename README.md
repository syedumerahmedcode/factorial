# recursion

## Table of content

- [Introduction](#introduction)
- [When to use Recursion](#when-to-use-recursion)
- [Recursion in 3 steps](#recursion-in-3-steps)
- [Out Of Scope](#out-of-scope)
- [Factorial](#factorial)
- [Fabonacci](#fabonacci)
- [Sum of digits](#sum-of-digits)
- [Power of a number](#power-of-a-number)
- [GCD](#gcd)
- [Product of an array](#product-of-an-array)
- [Recursive range](#recursive-range)
- [Reverse](#reverse)
- [Palindrome](#palindrome)
- [First uppercase](#first-uppercase)
- [Capitalize Word](#capitalize-word)
- [Project structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Prerequisities](#prerequisities)
- [Commands](#commands)
- [Contribution](#contribution)
- [References](#references)
- [Contact Information](#contact-information)

## Introduction

The project uses recursion to find solution of interesting problems in which iterative approach is perhaps not the most optimal one and recursion can be used as an alternative approach.

_Recursion_ is a way of solving problems by having a function calling itself or it solves a smaller subset of the problem. This goes on till an exit condition is reached.

## When to use Recursion

Following are the cases in which one should choose recursion.

- If we can divide the problem into smaller sub-problems
- Algorithm to compute nth ...
- Write code to list the n ...
- Implement a method to compute all.

- It is also used in data structures such as trees and graphs.
- It is used in many algorithms (such as divide and conquer, greedy and dynamic programming).

## Recursion in 3 steps

In the case of factorial(or any recursive program in general), It can be written by performing the following three steps:

- Step 1: Recursive case - the flow

This covers the bulk of the logic and performs the computation required. In our case of factorial, it will be:

```
n!=n*(n-1)!
```

- Step 2: Base case - the stopping criteria

This covers the exit condition, otherwise the recursive call will go on forever resulting in an exception. In our case, for factorial, it will be:

```
0!=1
1!=1
```

- Step 3: Unintentional case

This covers the cases which are outside the problem scope. In our case, for factorial, it will be negative numbers since the factorial is based of positive numbers:

```
factorial(-1) ???
```

Similarly, the same logic of three steps applies for computing recursive solutions as well. Some of which are discussed below.

## Out Of Scope

Since this is an beginner project in which the focus is just to learn the some basic recursion, testing is out of scope of this project.

## Factorial

A _factorial_ is the product of all the positive numbers less than or equal to _n_. It is denoted by n!. 

The formula for it is as follows:

```text

n!=n*(n-1)*(n-2)*(n-3)*...*3*2*1

Or, in other words:

n!=n*(n-1)!
```

For example, `7!=7*6*5*4*3*2*1=5040`.

**Visual description**

![Factorial](https://github.com/syedumerahmedcode/recursion/blob/master/src/main/resources/FactorialUsingRecursion.jpg)

## Fabonacci

A _fabonacci_ number sequence is a sequence of numbers in which each number is the sum of two preceeding numbers. The initial two numbers in this sequence are 0 and 1. 

The formula for it is as follows:

```text

f(n)=f(n-1)+f(n-2)

```

For example, `f(5)=f(4)+f(3)`.

**Visual description**

![Fabonacci](https://github.com/syedumerahmedcode/recursion/blob/master/src/main/resources/FabonacciUsingRecursion.jpg)

## Sum of digits

The core idea here is to find the sum of digits of a positive integer number using recursion. For example, 

```text

10 --> 10/10 = 1 and remainder = 0
54 --> 54/10 = 5 and remainder = 4

112 --> 112/10 = 11 and remainder = 2
	   11/10 = 1 and remainder = 1
```

So, the formula for recursive function turns out to be, `f(n)=n%10+f(n/10)`.

**Visual description**

![Sum of digits](https://github.com/syedumerahmedcode/recursion/blob/master/src/main/resources/SumOfDigitsUsingRecursion.jpg)

## Power of a number

The core idea here is to find the power of a positive integer number using recursion. For example, 

```text

xpowern = x*x*x*x*..(n times).*x
2⁴ --> 2*2*2*2 

```

So, the formula for recursive function turns out to be, `xpowern=x * xpowern-1`.

**Visual description**

![Power of a number](https://github.com/syedumerahmedcode/recursion/blob/master/src/main/resources/PowerOfANumberUsingRecursion.jpg)

## GCD

The core idea here is to find the Greatest Common Divisor of a positive integer number using recursion. the greatest common divisor (GCD) of two or more integers, which are not all zero, is the largest positive integer that divides each of the integers meaning that the remainder is zero. Here, the Euclidean algorithm for find GCD is modeled using recursion. 

The Euclidean algorithm is based on the principle that the greatest common divisor of two numbers does not change if the larger number is replaced by its difference with the smaller number. For example, 

```text
gcd(8,12) = 4

Using Euclidean algorithm:
gcd(48,18)
--> 48/18 = 2 remainder 12
--> 18/12 = 1 remainder 6
--> 12/6 = 2 remainder 0
Hence, the GCD is 6. 

```

So, the formula for recursive function turns out to be, `gcd(a,0) = a` and `gcd(a , b) = gcd(b , a mod b)`.

**Visual description**

![GCD](https://github.com/syedumerahmedcode/recursion/blob/master/src/main/resources/GCDUsingRecursion.jpg)

## Product of an array

We find the product of an array which takes an array as input and return the product of all the numbers inside it using recursion. For example, 

```text
productOfArray{1,2,3,4,5}

--> {1,2,3,4} * 5
--> {1,2,3} * 4 * 5
---->{1,2,3} * 20 
--> {1,2} * 3 * 4 * 5
---->{1,2,3} * 3 * 20
---->{1,2,3} * 60
--> {1} * 2 * 3 * 4 * 5
---->{1} * 2 * 3 * 20
---->{1} * 2 * 60
-->{1} * 120
---->1 * 2 * 3 * 4 * 5
---->1 * 2 * 3 * 20
---->1 * 2 * 60
---->1 * 120
---->120

```

So, the formula for recursive function turns out to be, `productofArray(int A[], int N)=(productofArray(A, N - 1) * A[N - 1])`.

**Visual description**

![Prodcut of an array](https://github.com/syedumerahmedcode/recursion/blob/master/src/main/resources/ProductOfAnArrayUsingRecursion.jpg)


## Recursive range

We create a function called _recursiveRange_ which accepts a number and adds up all the numbers from 0 to the number passed using recursion. For example, 

```text
recursiveRange(5)

--> 5 + 4
--> 5 + 4 +3
--> 5 + 4 +3 + 2
--> 5 + 4 +3 + 2 + 1
--> 5 + 4 +3 + 2 + 1 + 0

```

So, the formula for recursive function turns out to be, `f(n) = n + f(n-1)`.

**Visual description**

![Recursive range](https://github.com/syedumerahmedcode/recursion/blob/master/src/main/resources/RecursiveRangeUsingRecursion.jpg)

## Reverse

We create a function called _reverse_ which accepts a string and returns a new string in reverse using recursion. For example, 

```text
reverse('java') # 'avaj'
reverse('australia') # 'ailartsua'


```

So, the formula for recursive function turns out to be, `f(str) = f(str.substring(1)) + str.charAt(0);`.

**Visual description**

![String reverse](https://github.com/syedumerahmedcode/recursion/blob/master/src/main/resources/StringReverseUsingRecursion.jpg)

## Palindrome

We create a function for _palindrome_ which accepts a string as input and returns true if it is a palindrome, otherwsie false. This is achieved via recursion. 

A palindrome is a word, number, phrase, or other sequence of symbols that reads the same backwards as forwards, such as the words madam or racecar, the date/time stamps 11/11/11 11:11 and 02/02/2020, and the sentence: "A man, a plan, a canal – Panama". The 19-letter Finnish word saippuakivikauppias (a soapstone vendor), is the longest single-word palindrome in everyday use, while the 12-letter term tattarrattat (from James Joyce in Ulysses) is the longest in English. 

A simple example of this method is as follows: 

```text
isPalindrome('foobar') # false
isPalindrome('tomamot') # true

```

So, the formula for Palindrome turns out to be, `f(str) = f(str.substr[1,str.length-1]); when str.charAt(0)==str.charAt(str.length-1)`.

**Visual description**

![Palindrome](https://github.com/syedumerahmedcode/recursion/blob/master/src/main/resources/PalindromeUsingRecursion.jpg)

## First uppercase

We create a function for finding the _first uppercase instance_ of an alphabet in a given string using recursion. 

A simple example of this method is as follows: 

```text
findUppercase('transL') 
-->checkCharacterAt(0)
-->if true
---->return charAt(0)
-->if false
---->findUppercase(subString(1 till endOfinpuString)
--> goto checkCharacterAt(0)
```

So, the formula for finding first uppercase alphabet in a string turns out to be, `f(str) = f(str.substr[1,str.length-1]);`.

**Visual description**

![First uppercase alphabet](https://github.com/syedumerahmedcode/recursion/blob/master/src/main/resources/FirstUppercaseAlphabetUsingRecursion.jpg)


## Capitalize Word

We create a function which _capitalizes first instance_ of every word in a given sentence using recursion. 

A simple example of this method is as follows: 

```text
capitalizeWord('i like java programming') 
-->I like Java Programming
```

So, the formula for capitalizing first alphabet of each word in a string turns out to be, `f(str) = f(str.sub[0,str.len -1])+ char.toStr(ch) AND str.sub([str.len-2,str.len-1]==SPACE) then char.toUpperCase(ch);`.

**Visual description**

![Capitalize Word](https://github.com/syedumerahmedcode/recursion/blob/master/src/main/resources/CapitalizeWordUsingRecursion.jpg)



## Project structure

There are several packages, one for each problem, which contain the solution inside a _Service_ class. These service classes are instantiated and called from _main()_ inside the _Execute_ class which can be found inside _com.umer.main_ package.

## Technologies Used

- Java 11.

## Prerequisities

None

## Commands

In order to run the program, one needs to open the project in a suitable IDE(such as Eclipse, STS, VSCode 0or IntelliJ), navigate to the _Execute_ class inside _com.umer.main_ package. Once there, right click---> Run As ---> Java Application.

The program currently has hard-coded values and it does not take any input from the user. However, one can go inside the _main()_ inside _Excute_ class and change the input parameters as one sees fit. 

## Contribution

Feature requests, issues, pull requests and questions are welcome.

## References

- [1](https://bechtle.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/): Data Structures and Algorithms from Zero to Hero and Crack Top Companies 100+ Interview questions (Java Coding) **(Udemy)** **(Primary resource)**
- [2](https://en.wikipedia.org/wiki/Factorial): Factorial (Wikipedia)
- [3](https://en.wikipedia.org/wiki/Fibonacci_number): Fibonacci number (Wikipedia)
- [4](https://en.wikipedia.org/wiki/Greatest_common_divisor): Greater Common Divisor (Wikipedia) 
- [5](https://en.wikipedia.org/wiki/Euclidean_algorithm): Euclidean algorithm (Wikipedia)
- [6](https://en.wikipedia.org/wiki/Palindrome): Palindrome (Wikipedia)


## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=%5BGitHub%5D%20Hello%20from%20Github). 
