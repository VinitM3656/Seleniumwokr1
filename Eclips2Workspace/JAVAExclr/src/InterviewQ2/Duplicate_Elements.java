package InterviewQ2;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Elements {
	public static void main(String [] args) {
		int a[] = { 1,2,3,4,5,6,7,8,8,9};
		Set<Integer>UniqueSet = new HashSet<>();
		Set<Integer>DuplicateSet=new HashSet<>();;
		for(int val:a) {
			if(! UniqueSet.add(val)) {
				DuplicateSet.add(val);
				
			}
		}
		System.out.println("UniqueSet Values"+UniqueSet);
		System.out.println(" DuplicateSet Value"+DuplicateSet);
	}
	



}