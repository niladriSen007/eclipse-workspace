package string;
import java.util.Scanner;
public class StringFunctions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		 System.out.println("Enter The String");
//		 String s=sc.nextLine();
//         System.out.println(s.length());
//         System.out.println(s.charAt(1));
//         System.out.println(s.substring(0));
//         System.out.println(s.substring(0,s.length()));
         
         String name1="Ram";
         String name2=new String("Ram");
         System.out.println(name1==name2);
         System.out.println(name1.equals(name2));
	}

}
