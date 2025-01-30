package May01;


class Samsung{
	
	private int x,y,z;
	void setData() {
		x=10;
		y=56;
		z=45;
		
	}
	void display() {
		System.out.println(x+" "+y+" "+z);
		
	}
}

public class Funtion {
public static void main(String [] args) {
	Samsung s1 = new Samsung();
	s1.setData();
	s1.display();
	
}
}
