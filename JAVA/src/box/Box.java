package box;
import java.util.Scanner;
public class Box {

	
		Scanner sc=new Scanner(System.in);
		
		 private double width1;
		 private double height1;
		 private double depth1;
		 private void volume1()
		{
			System.out.println("VOLUME IS =>" + (width1*height1*depth1));
		}
		
		 void input()
		{
			System.out.println("Enter The Width,Height,Depth");
			width1=sc.nextDouble();
			height1=sc.nextDouble();
			depth1=sc.nextDouble();
			volume1();
		}

	}


