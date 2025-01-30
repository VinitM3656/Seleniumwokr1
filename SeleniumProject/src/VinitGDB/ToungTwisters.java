package VinitGDB;

public class ToungTwisters {
	public static void main(String[] args) {
		String tt =" she sells sea shells on the sea shore shall shoes"
				+ "";
		int count = 0;
		for (int i = 0; i<tt.length(); i++) {
			if(tt.charAt(i) != 's') {
				continue;
			}
			count++;
			
		}
		System.out.println("count:"+count);
		
	}

}
