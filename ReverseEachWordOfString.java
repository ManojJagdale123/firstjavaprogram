package stringProgram;

public class ReverseEachWordOfString {
	 
	public static void main(String[] args) {
		
	
	
	String s = "hello world";
	String[] s2 = s.split(" ");
	

	
	for(int j=0;j<s2.length;j++)
	{
		System.out.println(s2[j]);
	}
	
	 char c[] = s.toCharArray();
	 String s1="";
	
	for(int i = c.length-1;i>=0;i--)
	{
		s1 = s1+c[i];
	}
	System.out.println(s1);

	}

}
