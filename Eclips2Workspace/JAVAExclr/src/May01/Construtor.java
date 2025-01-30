package May01;

class Example{
	
	private int x,y;
	
	
	Example(){
		x=2;
		y=4;
		
	}

Example(int p ,int q){
	x=p;
	y=q;
}
void display() {
	int g;
	System.out.println(x+" ");
	System.out.println(y);
	
}

public static class Construtor {

	public static void main(String [] args) {
		Example e1 = new Example(5,6);
		e1.display();
		Example e2 = new Example();
		e2.display();
	}
}
}
