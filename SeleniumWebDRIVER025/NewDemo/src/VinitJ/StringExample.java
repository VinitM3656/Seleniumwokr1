package VinitJ;

public class StringExample {

	
	public static void main(String [] args) {
		
		String str1 = " Virat how are you man";
		
		String str2 = str1.replace("Virat", "Rohit");
		
		String arr[] = str1.split( " ");
		
		for(int i = 0 ; i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
		for(String element : arr) {
			System.out.print(element);
		}
		//System.out.println( str2);
		//System.out.println(str1.contains("ra"));
		//System.out.println( str1.contains("rat"));
		//System.out.println(str1.contains("virat"));
	System.out.println(" without white spaces");
	System.out.println(str1.trim());
	}
}
