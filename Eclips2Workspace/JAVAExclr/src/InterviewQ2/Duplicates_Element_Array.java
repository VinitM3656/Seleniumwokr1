package InterviewQ2;

public class Duplicates_Element_Array {
	
public static void main(String [] args) {
	int [] arr= { 1,2,3,4,5,6,7,2,3,4,5,6};
	System.out.println("Duplicate element arreay is");
	
	
	for( int i =0; i< arr.length;i++){//check regualr string
		for( int j = i+1; j<arr.length;j++) {//checl duplicate element
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
			}
		}
		
	}
	
}}
