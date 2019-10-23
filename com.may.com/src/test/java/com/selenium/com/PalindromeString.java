package com.selenium.com;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev, temp, sum = 0;
		int num = 454;
		temp = num;
		while(num>0)
		{
		rev = num%10; //getting remainder
		sum = (sum * 10)+rev;
		num = num/10;

	}
		if(temp == sum)
		{
			System.out.println("Entered num is palindrome");
		}
		else
		{
			System.out.println("Entered num is not palindrome");
		}
		}
}

