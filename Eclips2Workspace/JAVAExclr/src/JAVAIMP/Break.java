package JAVAIMP;

public class Break {
	
	public static void main(String [] args) {
		
		int list[]= {10,20,30,40,50};
		
		for(int i : list) {
			
			if(i==30)
				break;
			System.out.println(i);
		}
	}

}
