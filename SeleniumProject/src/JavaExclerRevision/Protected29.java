package JavaExclerRevision;

public class Protected29 {
	protected String fname = " jhion";
	protected String Vname = " Vinit";
	protected String Email= " vinit@gmail.com";
	
	
	class Student extends Protected29{
		private int graduationYear = 2019;
	
		
		 public void main(String[] args) {
			Student Obj= new Student();
			System.out.println("Name"+Obj.fname);
			System.out.println("Vname"+Obj.Vname);
			
		}
	}

}
