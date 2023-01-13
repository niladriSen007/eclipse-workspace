package even;
import java.util.Scanner;
public class binary {

	public static void main(String[] args) {
		int p=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a[]=new int[10];
		int i=0;
		System.out.println("the binary form is");
		while(n>0) {
			a[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			
			System.out.print(a[j]);
		}
		
		

	}

}
