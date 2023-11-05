package stringProgram;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		//String s= "naman";
		
		System.out.println(s);
		String s1="";
		
		char ch[] = s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			s1=s1 +ch[i];
			
		}
		System.out.println(s1);
		
		if(s.equals(s1))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
	
		}
	}

}
