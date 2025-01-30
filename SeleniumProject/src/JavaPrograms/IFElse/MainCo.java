package JavaPrograms.IFElse;

public class MainCo {
	int x;////////parameter for main class 
	
	public MainCo() {//defined construcotr in main class only and its value
		int x =87;///value of construcotr and same name as class name
	}
	public static void main(String [] args) {
		 MainCo myobj = new MainCo();
		System.out.println(myobj.x);
		
	}

}
