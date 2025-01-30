class Student{
	String name;
	String Qualification;
	int age;
	public static void main(String[] args){
	Student()
	{
	System.out.println("Student Constructor called");
	}
	void study(){
	System.out.println("Student is studying");
	}

	void run(){
	System.out.println("Student is runnig");
	}

	void sleep(){
	System.out.println("Student is sleeping");
	}
	}

	 public class StudentApplication{

	public static void main(String[] args){
	Student s1 = new Student();
	s1.study();
	s1.run();
	s1.sleep();

	}
	}