package stringProgram;

public class DouplicateElementArray {

	public static void main(String[] args) {
		
		
		   int [] arr = new int []{1, 2, 3, 4, 2, 7, 2, 8, 3};   
	          
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[i]);  
	            }  
	        }  
		
		
		
	}
	}
		
//		int a[] = new int[]{5,7,8,5,6,7,8,9,9,6,5};
//		
//		
//		
//		for(int i = 0; i<a.length;i++)
//		{
//			
//			for(int j=i+1;j<a.length;j++)
//				
//			{
//				if(a[i] == a[j]) //0=0,123456
//				
//					//System.out.println("i value " +i);
//					//System.out.println("j value " +j);
//
//					System.out.println(a[j]);
//				
//				
//			
//		}
//		
//	}
//	}}

