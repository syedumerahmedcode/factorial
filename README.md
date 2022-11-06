# recursion

## Table of content

- [Introduction](#introduction)
- [When to use Recursion](#when-to-use-recursion)
- [Recursion in 3 steps](#recursion-in-3-steps)
- [Factorial](#factorial)
- [Fabonacci](#fabonacci)
- [Sum of digits](#sum-of-digits)
- [Power of a number](#power-of-a-number)
- [Out Of Scope](#out-of-scope)
- [Project structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Prerequisities](#prerequisities)
- [Commands](#commands)
- [Contribution](#contribution)
- [References](#references)
- [Contact Information](#contact-information)

## Introduction

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

## Factorial

A _factorial_ is the product of all the positive numbers less than or equal to _n_. It is denoted by n!. 

The formula for it is as follows:

```text

n!=n*(n-1)*(n-2)*(n-3)*...*3*2*1

Or, in other words:

n!=n*(n-1)!
```

For example, `7!=7*6*5*4*3*2*1=5040`.

## Fabonacci

A _fabonacci_ number sequence is a sequence of numbers in which each number is the sum of two preceeding numbers. The initial two numbers in this sequence are 0 and 1. 

The formula for it is as follows:

```text

f(n)=f(n-1)+f(n-2)

```

For example, `f(5)=f(4)+f(3)`.

## Sum of digits

The core idea here is to find the sum of digits of a positive integer number using recursion. For example, 

```text

10 --> 10/10 = 1 and remainder = 0
54 --> 54/10 = 5 and remainder = 4

112 --> 112/10 = 11 and remainder = 2
	   11/10 = 1 and remainder = 1
```

So, the formula for recursive function turns out to be, `f(n)=n%10+f(n/10)`.

## Power of a number

The core idea here is to find the power of a positive integer number using recursion. For example, 

```text

xpowern = x*x*x*x*..(n times).*x
2⁴ --> 2*2*2*2 

```

So, the formula for recursive function turns out to be, `xpowern=x * xpowern-1`.


## Out Of Scope

Since this is an beginner project in which the focus is just to learn the some basic recursion, testing is out of scope of this project.

## Project structure

- To be defined.

## Technologies Used

- Java 11.

## Prerequisities

None

## Commands

- To be defined.

## Contribution

Feature requests, issues, pull requests and questions are welcome.

## References

- [1](https://bechtle.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/): Data Structures and Algorithms from Zero to Hero and Crack Top Companies 100+ Interview questions (Java Coding) **(Udemy)** **(Primary resource)**
- [2](https://en.wikipedia.org/wiki/Factorial): Factorial(Wikipedia)
- [3](https://en.wikipedia.org/wiki/Fibonacci_number): Fibonacci number(Wikipedia)

## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=%5BGitHub%5D%20Hello%20from%20Github). Additionally, you can reach me via [Linkedin](https://www.linkedin.com/in/syed-umer-ahmed-a346a746/) or at [Xing](https://www.xing.com/profile/SyedUmer_Ahmed/cv)
