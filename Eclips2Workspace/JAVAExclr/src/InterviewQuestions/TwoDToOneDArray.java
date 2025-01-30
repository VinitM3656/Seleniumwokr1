package InterviewQuestions;

public class TwoDToOneDArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6}};// two rows and three coloums


		int c[] =new int[5];//array a has more than 5 elements. It's advisable to dynamically calculate the size of the 1D array c 
		


		for(int i=0;i<a.length;i++)//this is for row
		{
			for(int j=0;j<a[i].length;j++)// this is for coloum
			{

				c[i]=a[i][j];
				System.out.print(c[i] + " ");
			}
		}
	}
}
