package Corejava.basics;

class ParentClass{
	
	int a ;
	void setData(int a) {
		
		this.a=a;
		
	}
}

class SecondChild extends ParentClass{
	
	void ShowData() {
		
		
		System.out.println(" value of this a "+a);
		
	}
}

class ThirdClass extends SecondChild{
	void disp() {
		System.out.println(" now disp is this vlaie");
	}
}




public class Inheritance {

	public static void main(String[] args) {
		
		ThirdClass C1 = new ThirdClass();
		C1.setData(3456);
		C1.ShowData();
	 
	}
}