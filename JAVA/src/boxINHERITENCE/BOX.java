package boxINHERITENCE;

public class BOX {
   
	 double width;
	 double height;
	 double bredth;
	
	BOX()
	{
		width=-1;
		height=-1;
		bredth=-1;
	}
	
	BOX(double w,double h,double b)
	{
		width=w;
		height=h;
		bredth=b;
	}
	
	BOX(BOX copy)
	{
		width=copy.width;
		height=copy.height;
		bredth=copy.bredth;
	}
	
	public double volume()
	{
		return (width*height*bredth);
	}
}
