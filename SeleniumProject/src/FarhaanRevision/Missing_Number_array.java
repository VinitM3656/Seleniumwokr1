package FarhaanRevision;

public class Missing_Number_array {
	
	public static void main(String [] args) {
		int a []= { 1,2,4,5,6,7,8};
		int sum1 = 0;////addig this values of a [] array to sum1 at each positon like1,2,4,5,6,7,8
		
		for( int i = 0; i<a.length;i++) {
		sum1 = sum1+a[i];
	}

		   System.out.println(sum1);
		   
		   
		   int sum2=0;
		   for( int i=0;i<=6;i++){  //This loop calculates the sum of all numbers from 0 to 6. It's assuming that the array elements are consecutive starting from 1, so the sum of consecutive numbers formula is used here.
			   sum2=sum2+i;
		   
		   
	System.out.println(sum2);
	
	System.out.println(" Missing number is "+(sum2-sum1));
	}
	}
	}
	
	
	
	


