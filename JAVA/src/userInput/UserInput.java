package userInput;
import java.util.Scanner;
public class UserInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Th eValue Of X=");
		String x=sc.nextLine();
		System.out.println("X is=");
		System.out.println(x);

		System.out.println("Enter Th eValue Of y=");
		int y=sc.nextInt();
		System.out.println("Y is=");
		System.out.println(y);

		System.out.println("Enter The Value Of z=");
		double z=sc.nextInt();
		System.out.println("z is=");
		System.out.println(z);
	}

}
