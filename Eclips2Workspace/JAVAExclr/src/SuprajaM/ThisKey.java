class Rectangle
{
	int l,b;
	void setData(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void display()
	{

		System.out.println(this.l);
		System.out.println(this.b);
	}
}
class ThisKey
{
	public static void main(String []args)
	{
	Rectangle r1=new Rectangle();
	
	r1.setData(11,12);
r1.display();
	}
}