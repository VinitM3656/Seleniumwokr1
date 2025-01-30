class staff{
	String staffId;
	long PhNo;
	int salary;
	void display(){

	System.out.println("Displaying content of staff member");
	System.out.println("ID is"+staffId);
	System.out.println("phone number is "+PhNo);
	System.out.println("Sakary is "+salary);

	}
}
class Teaching extends staff{
	String domain;
	String publications;
	Teaching(String sId,String n, long PNo,int s ,String d,String p) {
		staffId = sId;
		salary = s;
		domain = d;
		publications = p;
	}{

}

	void dispaly(){
		System.out.println("COONTENT of teachin staff member");
		System.out.println("teacher Id is "+staffId);
		//System.out.println("Teacher name is "+name);
		System.out.println("Teacher phone number is "+PhNo);
		System.out.println("sALARY IS "+salary);
		//System.out.println("Domain is "+Domain);
		System.out.println("Teacher Publication are"+publications);
	}
}
class Techinical extends staff{
	
	String skills;
	 Techinical (String sId,String n , long pNo,int string, String sk){
	staffId = sId;
	salary = string;
	skills= sk;
	}

	 void dispaly(){
			System.out.println("COONTENT of teachin staff member");
			System.out.println("teacher Id is "+staffId);
			//System.out.println("Teacher name is "+name);
			System.out.println("Teacher phone number is "+PhNo);
			System.out.println("sALARY IS "+salary);
			//System.out.println("Domain is "+Domain);
			//System.out.println("Teacher Publication are"+publications);
		}
}
 class Contract extends staff{
	int timeperiod;
	Contract(String sID,String n , long pNO,int s,int t){
	staffId = sID;
	PhNo=pNO;
	salary= s;
	timeperiod = t;
	}
	void dispaly(){
		System.out.println("COONTENT of teachin staff member");
		System.out.println("teacher Id is "+staffId);
		//System.out.println("Teacher name is "+name);
		System.out.println("Teacher phone number is "+PhNo);
		System.out.println("sALARY IS "+salary);
		//System.out.println("Domain is "+Domain);
		//System.out.println("Teacher Publication are"+publications);
	}

	}
public class adfdsfs extends staff{
	
	public static void main(String[] args){
	Teaching t1 = new Teaching("Excler123","ASHOK",988776365,40000,"cs", "padma reddy");
	t1.display();
	Techinical tech1 = new Techinical("Excelr345345","Vinit",988765432,"Entc","ViniT M");
	tech1.display();
	Contract c1 = new Contract("Excelr887878","Harsah",987654332,32000,12);
	c1.display();
	}
	}