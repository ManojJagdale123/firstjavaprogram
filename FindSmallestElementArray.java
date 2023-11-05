package stringProgram;

public class FindSmallestElementArray {

	public static void main(String[] args) {
		
		int a[] = {7,45,5,6,2};
		
		int size = a.length;
		
		int min = a[0];
		
		for(int i=0;i<size;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				
			}
		}
     System.out.println("small element in array " +min);
	}

}
