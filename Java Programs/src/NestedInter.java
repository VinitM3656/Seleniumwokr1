

interface OuterInterface{
	
	void outerMethod();
	
	interface innerinterface{
	 void innerMethod();	
	}
}


class Parent implements OuterInterface{
	
	public void outerMethod() {
		System.out.println(" this is OuterInterface");
		
	}
}

class ChildClass implements OuterInterface.innerinterface{

	
	public void innerMethod() {
		System.out.println(" this is innner");
		
	}
}




public class NestedInter {
  Parent Obj = new Parent();
  ChildClass Obj1 = new ChildClass();
  
  
 // Obj.outerMehtod();
  
 /// Obj1.innerMethod();
}
