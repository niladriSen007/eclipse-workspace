package privateINHERITENCE;

public class BOX1 {
	   
		 private double width;
		 private double height;
		 private double bredth;
		
		BOX1()
		{
			width=-1;
			height=-1;
			bredth=-1;
		}
		
		BOX1(double w,double h,double b)
		{
			width=w;
			height=h;
			bredth=b;
		}
		
		BOX1(BOX1 copy)
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
