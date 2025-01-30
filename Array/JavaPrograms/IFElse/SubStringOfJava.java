package JavaPrograms.IFElse;

public class SubStringOfJava { 
	public static void main(String args[])
	{
		String string sub;
		int i ,c,length;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to print its all substaring");
		string = in.nextLine();
		length = string.length();
		System.out.pritnln("Substring of \"+string+"\" are :-");
		for(c =0; c<lenght:c++)
		{
			for(i =1; i<=lenght-c;i++)
			{
				sub = string.substring(c,c+1);
				System.out.println(sub);
				
			}
		}
	}
	

}
