package com.selenium.com;

public class Starprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 7;
	        int count = number - 1;
	        for (int k = 1; k <= number; k++) {
	            for (int i = 1; i <= count; i++)
	                System.out.print(" ");
	            count--;
	            for (int i = 1; i <= 2 * k - 1; i++)
	                System.out.print("*");
	            System.out.println();
	}

}}
