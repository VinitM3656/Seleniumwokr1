package java1404;

public class Duplicate_Elements_Array {
	
	public static void main(String [] args) {
		int arr[] = {1,2,3,4,5,6,7,8,8,7,6,5,4,3,2,0};
		System.out.println("Duplicate elements in given number");
		// search for duplicate arrays
		
		
		for( int i = 0; i<arr.length;i++);{
			for(int j = i+1; j< arr.length;j++) {  //j= 0+1
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
				
			}
		}
	}

}
