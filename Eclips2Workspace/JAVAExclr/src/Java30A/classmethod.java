package Java30A;

public class classmethod {
 static void MyStaticMethod() {
	 System.out.println(" static methos has print");
	 
 
}
 
 public void mypublicMethod() {
	 System.out.println(" public method is invlved");
 }
 
	 public static void main(String [] args) {
		  MyStaticMethod();
	
		  
		  classmethod a = new classmethod();
		  a.mypublicMethod();
	 }
	 }
	