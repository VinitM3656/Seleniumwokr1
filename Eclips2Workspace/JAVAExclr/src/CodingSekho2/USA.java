package CodingSekho2;


class La{
	private int x,y;
	void setData(int p ,int q) {
		x= p;
		y= q;
		
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
		
	}
}












public class USA {
	
	public static void main(String [] args) {
		
		
		
		La a1= new La();
		a1.setData(23,12);
		 La a2 = new La();
		 a2.setData(34,21);
		 
		 a1.display();
		 a2.display();
		 
		
	}
	

}
