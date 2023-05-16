package operator;

import java.util.Scanner;

public class EuclideanDistance {
	public static void distanceCalculate(int a , int b) {
		double distance =Math.sqrt(Math.pow(a, a)+ Math.pow(b, b));
		System.out.println("Distance betwenn (0,0) to (" +a+ ","+b+")is "+String.format("%.2f", distance));
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Value of x - Axis ");
		int x =sc.nextInt();
		System.out.println("Enter The Value of y - Axis  ");
		int y =sc.nextInt();
		distanceCalculate(x, y);
	}

}
