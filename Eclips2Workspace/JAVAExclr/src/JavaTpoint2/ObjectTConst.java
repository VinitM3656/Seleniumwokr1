package JavaTpoint2;

class Employee{
	
	int id ;
	String name ;
	float Salary;
	
	
	void insert( int i , String name , float Salaey) {
		id = i;
		name = name;
		Salary = Salary;
		
	}
	void display() {
		System.out.println( id+" "+ name+" "+ Salary);
	}
}


















public class ObjectTConst {

	public static void main(String [] args) {
		Employee E1 = new Employee();
		Employee E2 = new Employee();
		Employee E3 = new Employee();
		
		E1.insert(23, "vinit", 15000);
		E2.insert(34, "bhimashankr", 34000);
		E3.insert(76, "Ajit", 12000);
		
		
		E1.display();
		E2.display();
		E3.display();
		
	}
}
