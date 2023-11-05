package stringProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no");
		int a = sc.nextInt();
		
		for(int i =1;i<=a;i++)
		{
		if(a%i==0)
		{
			count++;
		}
		}
		if(count==2)
        {
			System.out.println("no is prime " +a);
         }
		else
		{
			System.out.println("no is not prime " +a);
		}
		

	}

}
