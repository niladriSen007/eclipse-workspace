package array;
import java.util.Scanner;
public class MultiDimensional {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Enter The No Of Rows=");
		int r=sc.nextInt();
		System.out.println("Enter The No Of Columns=");
		int c=sc.nextInt();
		System.out.println("Enter The Inputs");
		int array[][]=new int[r][c];
		for ( i=0;i<r;i++)
		{
			for( j=0;j<c;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
