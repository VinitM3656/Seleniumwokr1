package InterviewQuestions;


/*In this example, both s1 and s2 are string literals, 
and since string literals are interned by the compiler,
 they will reference the same object in memory.
Therefore, the output will be "Using String Literals: true."*/ 
public class SString_1 {
	
	public static void main(String [] args) {
		String s1=" hello";
		String s2 = " hell0";
		
		if( s1== s2) {
			System.out.println(" useing string literals: true");
			
		}
		else {
			System.out.println(" Using String literals: false");
			
		}
		}

}
