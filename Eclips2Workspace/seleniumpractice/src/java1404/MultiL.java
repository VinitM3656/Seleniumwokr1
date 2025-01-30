package java1404;

class Nokia{
	int mic;
	void setMic() {
		mic=3;
		
	}
	void display() {
		System.out.println(mic);
		
	}
}





class Oppo extends Nokia{
	int sensore;
	
	void setsensore() {
		 sensore = 6;
		//System.out.println(" sensore  has been set");
		
	}
	void display() {
		System.out.println( "sensore has been set");
	}
}




class Vico extends Nokia{
	
	int camera;
	
	void SetCamera() {
		
		camera= 8;
		
	}
	
	
	void display() {
		
		System.out.println(" cmarea has been set");
		
	}
}

















public class MultiL {
	
	Nokia n1 = new Nokia();
	{
	n1.setMic();
	//((Object) n1).setSensor();
	n1.setMic();
	
	n1.display();
	n1.display();
	n1.display();
	
}
}