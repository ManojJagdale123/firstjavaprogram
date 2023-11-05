package stringProgram;

public class ToFindDuplicateCharInString {

	public static void main(String[] args) {
	
		
		String s = "i am java developer";
		
		char[] ch = s.toCharArray();
		//int count;
		for(int i=0;i<ch.length;i++)
		{
		//	count =1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]&&ch[i]!=' ')
				{
					//count++;
				   System.out.println(ch[j]);
				   break;
				
				}
				
			}
			
			/*
			 * if(count>1) { System.out.println(ch[i]); }
			 */
			
			
			
		
		}
		
		
	}
	

}
