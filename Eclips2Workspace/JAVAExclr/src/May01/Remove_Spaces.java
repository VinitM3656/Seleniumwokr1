package May01;

public class Remove_Spaces {
	public static void main(String [] args) {
		String s = " kumar hullater";
		for(char a:s.toCharArray()) {
			if(a!=' ') {
				System.out.println(a);
			}
		}
	}

}
