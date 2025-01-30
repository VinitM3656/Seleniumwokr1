

class ParentClass{
	
	
	int a;
	
	void setData(int a) {
		
		this.a=a;
		
	}
}


class ChildClass extends ParentClass{
	
	void showData() {
		
		System.out.println(" vlaue is this");
		
	}
}


class Thirdclass extends ParentClass{
	 void disp() {
		 System.out.println(" now almost gived up");
	 }
}



public class MultiLevel {
	
	public static void main(String [] args) {
		
		Thirdclass C1 = new Thirdclass();
		C1.disp();
		C1.setData(243);
		
	}

}
