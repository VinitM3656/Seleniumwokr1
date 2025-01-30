package JavaPrograms.IFElse;

public class ArrayChange {
public static void main(String[] args) {
	
	String [] cars = {" vw", "tata", "Audi", "Bmw"," Suzuki"};
	cars[2]= " bajaj";////here value became change
	int [] MyNum = { 3,4,5,6,7,8,9};
	
	
	// to update array value
	MyNum[3]= 45;
	cars[4] = "kawasaki";
	// 
	System.out.println(MyNum[3]);
	System.out.println(cars[4]);
	
	
	// to find lenght of an array
	System.out.println(cars.length);
	System.out.println(MyNum.length);
	
	
}

}
