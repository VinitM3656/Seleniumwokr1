package VinitGDB;

public class NestedLoop {
	public static void main(String [] args) {
		for(int i = 1; i<=2;i++) {
			System.out.println("outer"+ i);
			
			for(int j = 1;j<=3;j++) {
				System.out.println(" Innerclass"+j);
				
			}
			
		}
	}

}
