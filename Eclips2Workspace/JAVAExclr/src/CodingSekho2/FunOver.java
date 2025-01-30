package CodingSekho2;


class USA{
	
	int x,y;
	void fun1() {
		x= 22;
		System.out.println(x);
		
	}
	
	class UK extends USA{
		
		void fun1(int p) {////fun overlaoding
			
			y=p;
			System.out.println(y);
			
		}
	}
}

public class FunOver {
	public static void main(String []args)
	{
	UK u1=new UK();
	u1.fun1();
	u1.fun1();
	}
}


