package array;
import java.util.Scanner;
public class ArrayiNPUT {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No Of Elements==");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter The Array Elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
