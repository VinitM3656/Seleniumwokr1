package Souyamadam;

public class Duplicate_Element_Arrays {
	
	public static void main(String [] args) {
		
		int arr[] = { 1,2,3,4,5,1,2,3,4,5,6,7,8,1,2,2};
		 System.out.println(" Duplicate arrays in given array");
		 
	// for search duplicates element
		 
		 for(int i = 0 ; i<arr.length;i++) {
			
			 for(int j = i+1; j<arr.length;j++) {
				 
				 if(arr[i] == arr[j]);
			System.out.println(arr[j]);
			
			 }
		 }
		 }

}
