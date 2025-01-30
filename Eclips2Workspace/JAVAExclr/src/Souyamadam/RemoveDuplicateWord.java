package Souyamadam;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

	
	
	public static void main(String [] args) {
		
		String s1 = " vinit vinit b mhetre mhshter";
		String s2[]= s1.split(" ");
		
		Set<String> set= new LinkedHashSet<>();
		for(String x:s2) {
			set.add(x);
			
		}
		System.out.println(set);
	}

}

