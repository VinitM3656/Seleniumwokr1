package CodingSekho2;

interface USA{
	
	int x = 10;
	void fun1();
	
	
}

class UK implements USA{
public void fun1() {
	System.out.println(" ovverriden fun");
	
}

void fun2() {
	System.out.println(x);
}
	
}




public class Interface {

}
