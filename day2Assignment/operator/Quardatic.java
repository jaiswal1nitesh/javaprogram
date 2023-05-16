package operator;

import java.util.Scanner;

public class Quardatic {
	
	public static void calculateRoot(int a,int b,int c) {
		
		double delta= (b*b-4*a*c);
		if(delta<0) {
			System.out.println("Root Is Imaginary");
		}
		else {
		double roo1=(-b + Math.sqrt(delta))/(2*a);
		double roo2=(-b - Math.sqrt(delta))/(2*a);
	   System.out.println("First Root is "+roo1);
	   System.out.println("Second Root is "+roo2);
		}
	}
	public static void input() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Value of a ");
		int a =sc.nextInt();
		System.out.println("Enter The Value of b ");
		int b =sc.nextInt();
		System.out.println("Enter The Value of c ");
		int c =sc.nextInt();
		if(a==0 && b==0 && c==0) {
			System.out.println("Not Possible it is Zero Constat ");
		}
		else if(a==0) {
			System.out.println("It is Linear Equation ");
		}
		
		else {
		System.out.println("Your Quardatic equation is "+a+"x*x "+b+"x  "+c);
	    calculateRoot(a, b, c);
		}
	}
	
	public static void main(String[] args) {
		input();
		
	
	}

}
