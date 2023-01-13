package increment;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Th eNumber= ");
		int n=sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=n) {
			fact=fact*i;
			i=i+1;
		}
		System.out.println("Factorial OF "+n+" is = "+fact);
	}

}
