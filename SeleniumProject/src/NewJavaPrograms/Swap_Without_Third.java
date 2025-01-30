package NewJavaPrograms;

import java.util.Scanner;

public class Swap_Without_Third {
	
                    public static void main(String [] args) {
                    	int a ,b;//kahi tri assign krych asla tr int a=4; and kahi tri assign karych nasla tr int a;
                    	Scanner s = new Scanner(System.in);
                    	System.out.println(" enter fucking value a");
                    	 a=s.nextInt();//for take integer value
                    	 
                    	 
                    	 
                    	 System.out.println(" enter the fucing b number");
                    	 b = s.nextInt();
                    	 
                    	 a= a+b;
                    	 b=a-b;
                    	 a=a-b;

                    	 System.out.println("value in a"+a);
                    	 System.out.println(" values in b"+b);
                    }
                    	 
                    	 
                    }