package com.bridgelabz;

import java.util.Scanner;

public class Ex5_GetTheNameUsingCommandLine {
	
	
	
   	public static void main(String args[]) {
   		
   	//method 1 = by giving arguments in run configuration 
   		
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		
	//method 2 =  using scanner class	
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
		String name = sc.next();

		System.out.println("Hello " + name);
		
	}
	
	
}
