package loopProgram;

import java.util.Scanner;

public class SumOfDigitWhile {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the terms You want to the sum");
		int terms =sc.nextInt();
	//	int formula = (terms*(terms+1))/2;
		//System.out.println("sum is " +formula);
		int sum=0,i=1;
		while(i<=terms) {
			sum=sum+i;
			i++;
			}
System.out.println("The Sum of " +terms+" Natural Number is---->"+sum);		
		
		
	}
	
	
	
	
}
