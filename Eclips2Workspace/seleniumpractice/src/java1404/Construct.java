package java1404;


class Example{
	
	private int x,y;
	

Example(){////non argument constructor
	x=2;
	y=4;
	
}

Example( int p , int q){/// parameter construcutor
	x=p;
	y=q;
	
}

void display() {
	System.out.println(x);
	System.out.println(y);
	
}
}




public class Construct {
	
	
	
	public static void main(String [] args) {
		
	Example E1= new Example(4,5);
	E1.display();
	Example E2= new Example();
		
		E2.display();
}
}
