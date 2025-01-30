package VinitJ;




class Student{
	
	String name;
	String qualification;
	int age;
	// constructor
	
	Student(){
		
		System.out.println("Student Constructor called");
	}
	void study() {
		
		System.out.println("student is runnng");
		
	}
	
	void sleep() {
		System.out.println("Student is sleeping");
	}
}











public class Constructor {
	
	public static void main(String [] args) {
		Student s1 = new Student();
		s1.study();
		s1.study();
		s1.sleep();
	}

}
