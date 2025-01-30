package JavaPrograms.IFElse;

public class parameterizedCo {
	int x;//class parameter any data type you can give
	public parameterizedCo(int y) {///we gave parameter here(int y)
		x= y;                       // same name as class name
		
	}

	public static void main(String [] args) {
		parameterizedCo myobj = new parameterizedCo(6777);//obj creat
		System.out.println(myobj.x);
		
		
	}
		
	}