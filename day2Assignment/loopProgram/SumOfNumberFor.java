package loopProgram;
import java.util.Scanner;
public class SumOfNumberFor {

	public static void main(String[] args) {
		   Scanner sc =new Scanner(System.in);
		   System.out.println("Enter the terms You want to the sum");
		   int terms =sc.nextInt();
		   SumOfNumberFor snf =new SumOfNumberFor();
		   snf.sum(terms);

	}

   public void sum(int a) {
	    int sum=0;
		for (int i=1; i<=a; i++) {
		   sum=sum+i;
		   }
	   System.out.println("sum of "+a+" Natural Number is "+sum);
	   
	   }
}  
