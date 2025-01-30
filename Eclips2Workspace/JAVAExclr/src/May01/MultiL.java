package May01;

class Nokia{
	
	int mic;
	
	void setMic() {
		mic = 2;
		
	}
	void display() {
		System.out.println(mic);
		
	}
}
class Nokia2 extends Nokia{
	int sensor;
	void setsensor()
	{
		sensor=5;
		
	}
	void display() {
		System.out.println(sensor);
		
	}
	
}

class Nokia3 extends Nokia2{
	int touchpad;
	void settp() {
		touchpad = 10;
		
	}
	void displayTP() {
		System.out.println(touchpad);
		
	}
}











public class MultiL {
	public static void main(String [] args) {
		Nokia3 n1 = new Nokia3();
		n1.setMic();
		n1.setsensor();
		n1.settp();
		n1.display();
		n1.display();
		n1.displayTP();
		
	}

}
