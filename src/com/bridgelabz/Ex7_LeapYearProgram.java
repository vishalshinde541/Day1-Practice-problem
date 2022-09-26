package com.bridgelabz;

import java.util.Scanner;

//Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400
//For e.g. 1800 is not a Leap Year and 2000 is a Leap Year.
public class Ex7_LeapYearProgram {
	
	public static void main(String[] args) {
		Scanner yr = new Scanner(System.in);
		System.out.println("Enter a year : ");
	    int year = yr.nextInt();
	    
	    if (year < 1582) {
	    	System.out.println("Invalid Input : The LeapYear program only works for year >= 1582");	
		}
	    
	    else if (year%100!=0 && year%4==0 || year%100==0 && year%400==0) {
	    	System.out.println(year + " is a leap year");
		}
	    
	    else {
	    	System.out.println(year + " is not a leap year");
		}
		
	}

}
