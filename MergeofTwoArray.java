package stringProgram;

public class MergeofTwoArray {

	public static void main(String[] args) {
		
		int[] a  = {4,5,6,7};
		int[] b = {1,2,3};
		
		int c[] = new int[8];
		
		int x=0;
		for(int i = 0;i<4;i++)
		{
			c[x]=a[i];
			//System.out.println(c[i]);

			x++;
		}
		
		for(int i = 0;i<3;i++)
		{
			c[x]=b[i];
			//System.out.println(c[i]);
x++;
			
		}
		
		
		for(int i = 0;i<8;i++)
		{
			
			System.out.println(c[i]);

			
		}
	}

}
