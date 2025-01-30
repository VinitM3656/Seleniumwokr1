package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Element_In_ArrayCollection {
public static void main(String [] args) {
	
	int a [] = { 1,2,3,4,56,7,8,9,1,2,3,4,3,2,1,3,4,5};   
	Set<Integer>UniqueSet = new HashSet();
	Set<Integer>DuplicateSet = new HashSet();
	
	for( int val : a){
		if( UniqueSet.add(val) ) {
			DuplicateSet.add(val);
				System.out.println(" this is UniqueSet"+ val);
				System.out.println(" this is DuplicateSet"+val);
				
		}
	}
			}
		}
	
	
	