package constructor;
import java.util.Scanner;
public class BOX {
	Scanner sc=new Scanner(System.in);
	
	private double width;
	private double height;
	private double bredth;
	
	BOX()   //Default constructor
	{
		System.out.println("Constructing The Box");
		System.out.println("Enter The Width,Height,Bredth");
		width=sc.nextDouble();
		height=sc.nextDouble();
		bredth=sc.nextDouble();
		
	}
	BOX(double width,double height,double bredth)   //parameterized constructor
	{
		this.width=width;
		this.height=height;
		this.bredth=bredth;
	}
	
	BOX(BOX copy)   //copy constructor
	{
		this.width=copy.width;
		this.height=copy.height;
		this.bredth=copy.bredth;
	}
	public double volume()
	{
		return width*height*bredth;
	}

}
