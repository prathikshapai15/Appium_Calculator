package com.selenium.com;


public class SwapwithoutTemp {	
		// TODO Auto-generated method stub
	public static void main(String args[])
	{
		
		System.out.println("Execution of program without Temp");
		swapwithouttemp();
		System.out.println("Execution of program with Temp");
		swaptemp();
		
	}
	
public static void swaptemp() {
	int a = 10;
	int b = 5;
	int t;
	t = a; // t value is 10
	b = a; // b value is 10
	a = b; // a value is 5
	
	System.out.println("numbers after swap with temp :"+a);
	System.out.println("numbers after swap with temp :"+b);
			
		}
	
private static void swapwithouttemp(){	
	
	int a =10;
	int b = 5;
	a = a-b; // value of a is 5 now
	b = a+b; // value of b is 5+10 -> 15 now
	a = a-b; // value is 5-15 = 10
	
	System.out.println("numbers after swap without temp :"+a);
	System.out.println("numbers after swap:"+b);
}
}



