package FarhaanRevision;

/*In this example, new is used to explicitly create new string objects. 
 * Even though the contents of s1 and s2 are the same, using == will check if 
 * they refer to the exact same object in memory. In this case, the output will be
 * "Using new Keyword: false" because s1 and s2 reference different objects.*/
public class String2 {
	public static void main(String[] args) {
	        
	        String s1 = new String("hello");
	        String s2 = new String("hello");

	        if (s1 == s2) {
	            System.out.println("Using String Literals: true");
	        } else {
	            System.out.println("Using String Literals: false");
	        }
	    }
	}
	

//True//
/*if (s1.equals(s2)) {
    System.out.println("Using equals method: true");
} else {
    System.out.println("Using equals method: false");
}*/
