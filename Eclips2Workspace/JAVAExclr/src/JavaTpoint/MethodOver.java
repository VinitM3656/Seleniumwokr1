package JavaTpoint;


class ParentClass{
	int num = 10;
	
	void showData() {
		
		System.out.println(" inside ParentClass show Data");
	}
}

class ChilClass extends ParentClass{
	void showData() {
		
		System.out.println(" insdie childclass show data");
	}
}



public class MethodOver {
	
	public static void main(String [] args) {
		 ParentClass obj = new  ParentClass();
		obj.showData();
		
		obj= new ChilClass();
		obj.showData();
	}

}
