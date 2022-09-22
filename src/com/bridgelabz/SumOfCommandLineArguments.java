package com.bridgelabz;

import java.util.Scanner;

public class SumOfCommandLineArguments 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number :");
		int num1 = scan.nextInt();
		System.out.print("Enter 2nd number :");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
	
		System.out.println("sum = " + sum);
	}

}
