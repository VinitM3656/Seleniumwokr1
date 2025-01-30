
public class Thir {
	
	class A{
		
		private int x,y;
		void setData(int x, int y) {
			
			this.x=x;
			this.y=y;
			
		}
		
		
		void display() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	
	public static void main(String [] args) {
		
		A a1 = new A();
		
		a1.setData(10, 20);
		a1.display();
		
		
	}

}
