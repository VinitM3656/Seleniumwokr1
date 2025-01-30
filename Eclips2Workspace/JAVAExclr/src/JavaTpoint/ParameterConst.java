package JavaTpoint;

class ParentClass{
	int a;
	
	
	ParentClass(int a ){
		
		System.out.println(" inside parent with parametr const");
		
		this.a =a ;
		
	}
	
	ParentClass(){
		System.out.println(" insdei the parameter constructor");
	}
}

class Childclass extends ParentClass{
	Childclass(){
		System.out.println(" Inside Chilclass constructor");
		
	}
}

public class ParameterConst {
	
	public static void main(String [] args) {
		
		Childclass obj = new Childclass();
		
		
	}

}
