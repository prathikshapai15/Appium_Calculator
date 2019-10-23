package com.selenium.com;

public class String_Mutimmute {
	
	public static void main(String args[])
	{

		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("Buddyma"); //String Immutable code
		StringBuilder s1 = s.append(" is good");
System.out.println("Appended Immutable string output:" +s1);
String obj = "Buddyma";
String obj1 = obj.concat(" is good"); //String Mutable code
System.out.println("" +obj1);
	}

}
	

