package JAVAIMP;

import java.io.StringBufferInputStream;

public class GivenStringpalindrome {
	public static void main(String[] args) {
		try
		{
			String str ="120";
			String sbr = new StringBuffer(str).reverse().toString();
			if(str.equals(sbr))
				System.out.println("Given string is palyndrom");
			else
				System.out.println("given string is not palyndrom");
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
