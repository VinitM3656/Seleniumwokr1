package JavaTpoint2;
 class Student{
	 
	 int rollno;
	 String name ;
	 static String college = " cdac";
	 
	//constructor
	 Student(int rollno, String name){
		 
		 rollno = rollno;
		 name = name;
		 
	 }
	 void disp() {
		 System.out.println(rollno+" "+ name);
		 
	 }
 }












public class Over {
	
	public static void main(String [] args) {
		
		Student s1 = new Student(111,"Karan");  
		 Student s2 = new Student(222,"Aryan");  
	
	s1.disp();
	s2.disp();
	
	}
	

}
