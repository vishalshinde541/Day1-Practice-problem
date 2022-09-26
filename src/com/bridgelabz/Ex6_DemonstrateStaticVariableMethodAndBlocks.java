package com.bridgelabz;

public class Ex6_DemonstrateStaticVariableMethodAndBlocks {
	static int a =10;                   // Static variable
	
	public static void m1() {                                           // static method
		System.out.println("Running static method from same class");
	}
	
	static {                            //static Block       
		System.out.println("Running static Block from same class ");
	}
	
	public static void main(String[] args) {
		System.out.println("Static variable from same class: " + a);
        m1();
        
        System.out.println("------------");
        
        System.out.println("Static variable from diff class: " + Demo.b);
        Demo.m2();    	
	}
	
// 2nd class
}

     class Demo {
    	 static int b = 15;
    	 
    	 
    	 public static void m2() {                                           // static method from diff class
    			System.out.println("Running static method from diff class");
    		}
    		
    		static {                            //static Block diff class      
    			System.out.println("Running static Block from diff class ");
    		}
}