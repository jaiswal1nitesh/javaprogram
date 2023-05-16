package loopProgram;

import java.util.Scanner;

public class PalindromeFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int i=1, temp =num,rev=0;
		int length = String.valueOf(num).length();//Find the Length of Number
	    System.out.println(+num+"Length is " +length);
		for (i=1; i<=length; i++) {
			int mod=num%10;
			rev=rev*10+mod;
			num=num/10;
		}
		String res=(rev == temp) ? "Pailndrome" : "Not Palindrome";
		System.out.println("Number is "+res);
		
	
		}

	}


