package loopProgram;

import java.util.Scanner;

public class ReverseOfNumberWhile {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		int num =sc.nextInt();
		int rev =0,temp=num;
		while(num!=0) {
			
			int mod=num%10;
			rev=rev*10+mod;
			num=num/10;
		}
		System.out.println("Reverse Number of "+temp+" is -->" +rev);

	}

}
