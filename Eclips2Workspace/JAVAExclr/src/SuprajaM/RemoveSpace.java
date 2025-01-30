package SuprajaM;

public class RemoveSpace {
	public static void main(String [] args) {
		
		String str= " hi World";
		System.out.println(str);
		
		System.out.println(str.replaceAll("^[ \t]+![  |\t]+$",""));
		
	}

}
