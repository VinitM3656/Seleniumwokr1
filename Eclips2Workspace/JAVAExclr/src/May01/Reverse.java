package May01;

public class Reverse {
	public static void main(String []args) {
		
		String s = " kumakar";
		String sarr[] = s.split("");
		for(int i = sarr.length-1;i>=0;i--) {
			System.out.println(sarr[i]);
		}
	}

}
