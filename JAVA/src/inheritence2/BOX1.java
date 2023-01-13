package inheritence2;

public class BOX1 {

	
	private double width;
	private double height;
	private double depth;
	
	
	BOX1()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	BOX1(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	BOX1(BOX1 ob)
	{
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	
	public double volume()
	{
		return ((width*height*depth)) ;
	}
	
}
