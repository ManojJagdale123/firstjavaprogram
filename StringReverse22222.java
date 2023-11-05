package stringProgram;

import java.util.Iterator;

public class StringReverse22222 {

	public static void main(String[] args) {
		
		
		String s = "manoj";
		
		String rev ="";
	
	char s1[] = s.toCharArray();
	
   for(int i =s1.length-1;i>=0;i--)
   {
	   rev = rev + s1[i];
   }
		
		System.out.println(rev);
		
		

	}

}
