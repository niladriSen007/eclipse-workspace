package pattern;
import java.util.Scanner;
public class Diamond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,i,j,s,s1;
		System.out.println("Enter The Range->");
		int n=sc.nextInt();
		int c=n%2;
		if(c==0)
		{
			 n1=n/2;
		}else {
			 n1=n/2+1;
		}
		 n2=n-n1;
		 i=1;
		 while(i<=n1) {
			 s=n1-i;
			 j=1;
			 while(j<=s) {
				 System.out.print(" ");
				 j++;
			 }
			 int q=(2*i)-1;
			 int k=1;
			 while(k<=q)
			 {
				 System.out.print("*");
				 k++;
			 }
			 i++;
			 System.out.println(" ");
		 }
		i=n2;
		while(i>=1)
		{
			j=1;
			if(c==0)
			{
				s1=n2-i;
			}else {
				s1=n2-i+1;
			}
			while(j<=s1)
			{
				System.out.print(" ");
				j++;
			}
			int k=1;
			int q=(2*i)-1;
			while(k<=q)
			{
				System.out.print("*");
				k++;
			}
			i--;
			System.out.println("");
			
			
		}
	}

}
