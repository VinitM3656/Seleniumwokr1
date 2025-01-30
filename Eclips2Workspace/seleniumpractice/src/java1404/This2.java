package java1404;


class A{
	
	private int  x,y;
	void setData( int x ,int y) {
		
		this.y= y;
		this.x= x;
		
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
		
	}
}














public class This2 {
public static void main(String [] args) {
	A a1 = new A();
	a1.setData(12, 120);
	a1.display();
	
	

}
}
