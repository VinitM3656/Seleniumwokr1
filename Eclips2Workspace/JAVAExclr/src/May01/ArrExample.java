package May01;

class Circle{
	private int r;
	double a;
	
	void setData(int p) {
		
		r=p;
	}
	
	void calAOC() {
		a=3.14*r*r;
		
	}
	
	void display() {
		System.out.println(a);
		
	}
}



public class ArrExample {
               public static void main(String [] args) {
            	   Circle a1 = new Circle();
            	   a1.setData(34);
            	   a1.calAOC();
            	   a1.display();
               }
}
