
class ParentClass{
	
	int num = 4;
	 void ShowDatat() {
		 
		 System.out.println(" we are going to override method");
		 System.out.println(" now we are doing overloaing");
		 
	 }
}

class ChilClass extends ParentClass{
	
	void showData() {
		
		System.out.println(" we are now going to make overrde method");
		System.out.println(" we are now foing ");
	}
}

public class Overloading {
     public static void main(String []args) {
    	 
    	 ParentClass obj = new ParentClass();
    	 obj.ShowDatat();
    	 
    	 ChilClass Obj = new ChilClass();
    	 Obj.showData();
    	 
    	 
     }
}
