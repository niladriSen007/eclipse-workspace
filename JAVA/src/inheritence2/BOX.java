package inheritence2;

public class BOX {
	
	double width;
	double height;
	double depth;
	
	
	BOX()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	BOX(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	BOX(BOX ob)
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
