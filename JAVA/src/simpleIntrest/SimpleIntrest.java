package simpleIntrest;
import java.util.Scanner;
public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value Of Principle");
		int p=sc.nextInt();
		System.out.println("Enter The Value Of Rate");
		float r=sc.nextFloat();
		System.out.println("Enter The No Of Time");
		int t=sc.nextInt();
		
		float si=(p*r*t)/100;
		System.out.println("Intrest Is ="+si);

	}

}
