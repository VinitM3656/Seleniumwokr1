package InterviewQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate{
	public static void main(String [] args) {
		
		String s1 = " hello how are you hello";
		String [] s2= s1.split(" ");
		Set<String>set= new LinkedHashSet<>();// This set will store unique elements in the order of their insertion.
		for( String x:s2) {
			
			set.add(x);
			
		}
		System.out.println(set);
	}
		
	}
