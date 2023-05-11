package day1Problem;

import java.util.Scanner;

public class TenMultipleWord {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Number which  Multiple of ten ");
		int number =sc.nextInt();
		if(number==1) {
			System.out.println("Unit");}
		else if(number==10) {
			System.out.println("Ten");
		}
		else if(number==100) {
			System.out.println("Hundred");
		}
		else if(number==1000) {
			System.out.println("Thousand");
		}
		else if(number==10000) {
			System.out.println("Ten Thousand");
		}
		else if(number==100000) {
			System.out.println("Lakh");
		}
		else if(number==1000000) {
			System.out.println("Ten Lakh");
		}
		else if(number==10000000) {
			System.out.println("cr");
		}

		else {
			System.out.println("Enter Invailed Number "+number);
			System.out.print("Enter Number like 1,10,100,1000, etc");
			

	}

}}
