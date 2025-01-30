package JavaTpoint2;


class Student34{
	int rollno;
	String name ;
	
	void insertRecord(int r, String n)
{
		rollno = r;
		name = n;
		
		
		}
	
	void disp() {
		System.out.println( rollno+" "+ name);
		
	}
}
















public class Student2 {
	public static void main(String [] args) {
		Student S1 = new Student();
		//Studnet S2 = new Studnet();
		
		
		S1.insertRecord(21, "vinit");
		S1.disp();
		
	}

}
