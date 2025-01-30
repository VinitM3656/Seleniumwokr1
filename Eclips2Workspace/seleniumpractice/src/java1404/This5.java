package java1404;

class Rectangle{
	
	
	int length; 
	int breadth;
	
	void setData(int length , int breadth) {
		
		this.length =length;
		this.breadth =breadth;
		
	}
	
	void display() {
		System.out.println("length og this recath"+" "+ this.length);
		System.out.println("breadth of this react"+" "+this.breadth);
		
	}
}

public class This5 {
	public static void main(String [] args) {
		Rectangle R1= new Rectangle();
		R1.setData(231,34);
		R1.display();
	}

}
