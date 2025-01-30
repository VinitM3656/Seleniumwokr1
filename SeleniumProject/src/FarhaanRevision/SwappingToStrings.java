package FarhaanRevision;

import java.util.Arrays;

public class SwappingToStrings {
public static void main(String [] args) {
	
	int a [] = { 1,2,3,4,5};
	int b [] = { 6,7,8,9,10};
	
	int c []= a;///a rikama zala mg b la taka a madhe
	
	a= b;////B LA takla a madhe mg b rikama zala
	b=c;  //b rikama zala mg c la taka
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
}
}
