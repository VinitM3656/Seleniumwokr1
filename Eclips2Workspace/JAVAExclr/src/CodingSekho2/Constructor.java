package CodingSekho2;
class Example{
	
	private int x,y;
	{
		
		// default cost by compiler
	}
Example(){
	x=3;    // non argument const
	y=4;
	
	
}
Example(int p, int q)
{                    // parameterise const
	x=p;
	y= q;
	
}
 void display() {
	 int g;
	 System.out.println(x);
	 System.out.println(y);
	 
 }















public static class Constructor {
	public  static void main(String [] args) {
		Example e1 = new Example(5,6);
		Example e2 = new Example();
		
		
	}
}

}
