package SuprajaM;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesinArray {
	
	public static void main(String [] args) {
		
		
		List<Integer> list1= new ArrayList<Integer>();
		List<Integer>list2= new ArrayList<Integer>();
	list1.add(0);
	list1.add(1);
	list1.add(2);
	list1.add(3);
	list1.add(4);
	
	for(int i =0 ;i<list1.size();i++) {
		for(int j = i+1;j<list1.size();j++) {
			if(list1.get(i)==list1.get(j));
			{
				
				list2.add(list1.get(j));
				
			}
		}
	}
	System.out.println(list2);
	
		
		
	}

}
