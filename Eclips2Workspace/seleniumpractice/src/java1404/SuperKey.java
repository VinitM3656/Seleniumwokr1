package java1404;


class India{
	int x,y;
	
}
class Ukrain extends India{
	int x,y;
	void setData( int p, int q) {
		int x,y;
		super.x=p;
		super.y=q;
		
	}
	
	void display() {
		System.out.println(super.x);
		System.out.println(super.y);
		
	}
}


















public class SuperKey {
	Ukrain u1 = new Ukrain();

	u1.setData(10,20);
	u1.display();
}
}

}
