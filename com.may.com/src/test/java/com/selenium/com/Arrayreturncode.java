package com.selenium.com;

public class Arrayreturncode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {10,20,30,40,50};
			display(numbers);	
			int[] revmarks;
			revmarks = reverseArray(numbers);
			System.out.println("Reveresd array elements are:");
			reverseArray(numbers);
		}

	private static void display(int[] input) {
		// TODO Auto-generated method stub
		for (int i= 0; i<input.length;i++) {
				System.out.println(input[i]);
	}

	}
	
	public static int[] reverseArray(int[] input) {
		int[] reverse = new int[input.length];
		for(int i=0,j= reverse.length-1;i < input.length; i++,j--) {
			reverse [j] =input[i];
		}
		
		return reverse;
	}

}
