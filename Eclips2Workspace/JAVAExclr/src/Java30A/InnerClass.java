package Java30A;


class Outrclass{
int x = 10;


class Innerclass{
	int y = 5;
	
}
}
public class InnerClass {
	public static void main(String [] args) {
		
Outrclass A = new Outrclass();
Outrclass.Innerclass myInner = A.new Innerclass();
System.out.println(myInner.y + A.x);
	
	}

}
