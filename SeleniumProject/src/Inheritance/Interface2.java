package Inheritance;

interface Animal{
	public void animalsound();
	public void sleep();
	}
class pig implements Animal{
	public void animalsound(){
	System.out.println(" pig says wee wee");
}

public void sleep() {
	System.out.println(" zzz");
}
}

public class Interface2 {
	public static void main(String [] args) {
		pig p = new pig();
		//p anialsound();
		p.sleep();
	}

}
