package conditionalStatements;

import java.util.Scanner;

public class palindromeUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original,reverse="";
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a String to check if it is Palindrome:");
		original=in.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--) 
			reverse=reverse+original.charAt(i);
			if(original.equals(reverse))
			
				System.out.println("String is Palindrome");
			
			else 
				System.out.println("String is not Palindrome");
			

	}
}
