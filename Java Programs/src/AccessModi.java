 

class ParentClass1{
	
	int a= 10;
	public int b = 45;
	protected int c = 98;
	 private int d = 76;
	 
	 
	 void showData() {
		 
		 System.out.println(" now wre doing AcccesMODIFIER and we are now in parent");
		 
		 System.out.println("a"+ a);
		 
		 System.out.println("b"+b);
		 
		 System.out.println(" c"+c);
		 System.out.println("d"+d);
	 }
	 
}

class SecondClass extends ParentClass1{
	void accessData() {
		
		System.out.println(" insideChildCLass");
		
		System.out.println(" a"+a);
		System.out.println("b"+b);
		
		System.out.println("c"+c);
		
		//System.out.println("d"+d); private member cant be accesee
	}
}

public class AccessModi {
	
	public static void main(String [] args) {
		
	SecondClass C2 = new SecondClass();
	C2.showData();
	C2.accessData();
}
}
