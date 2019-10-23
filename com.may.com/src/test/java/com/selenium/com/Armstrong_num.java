package com.selenium.com;

public class Armstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,a,temp;  
	    int n=153;//It is the number to check armstrong  
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	   /* System.out.println("Value of a:" +a);*/
	    n=n/10; 
	    /*System.out.println("Value of n:" +n);*/
	    c=c+(a*a*a); 
	   /* System.out.println("Value of c:" +c);*/
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	   }  

	}


