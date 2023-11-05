package stringProgram;

public class FindLargestElementArray {

	public static void main(String[] args) {
		
		int a[] = {89,45,32,89,10,56,101};
		
		int max=a[0];
		System.out.println(max);
		for(int i = 0;i<a.length;i++)
		{
		    
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}
		System.out.println(max);

	}

}
