package stringProgram;

public class FindSecondLargestElementinArray {

	public static void main(String[] args) {
		
		int a[] = {7,4,8,2,1,6,9};
		int size=a.length;
		int temp;
		for(int i = 0;i<size;i++)
		{
			for(int j = 0+1;j<size;j++)

		    
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		
		System.out.println("element is " +a[size-2]);

	}
}
	
