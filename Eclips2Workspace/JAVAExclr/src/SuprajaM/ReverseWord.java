package SuprajaM;

public class ReverseWord {
	public static void main(String [] args) {
		String inputString = " indina is my ountry";
		String [] outputArray;
		String outputString = "";
		
		
		String [] splitArray= inputString.split("");
		for(int i = splitArray.length-1;i>0;i--) {
			outputString = outputString + " "+ splitArray[i];
			
		}
		System.out.println(outputString);
		
	}

}
