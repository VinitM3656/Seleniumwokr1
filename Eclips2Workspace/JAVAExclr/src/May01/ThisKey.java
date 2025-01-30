package May01;


class Rectangle{
	
	
	int l,b;
	void setData(int l ,int b) {
		this.l=l;
		this.b=b;
		
	}
	void display() {
		System.out.println(this.l);
		System.out.println(this.b);
		
	
	}
}


public class ThisKey {
    public static void main(String [] args) {
    	Rectangle R1= new Rectangle();
    	R1.setData(23, 230);
    	R1.display();
    }
}

