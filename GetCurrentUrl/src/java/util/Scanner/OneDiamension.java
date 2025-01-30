package java.util.Scanner;



public class OneDiamension {
	
	public static void main (String[] args) {
		int arr[] = new int [5];
		Scanner scan = new Scanner(System.in);
		
		for (int i =0; i < 5; i++) {
			System.out.println("Enter the number");
			arr[i] = scan.nextInt();
		}
		 for (int i =0; i<5; i++) {
			 System.out.println(arr[i]);
			 
		}
	}

}
