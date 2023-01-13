package inheritence2;

public class BOX_DEMO extends BOX {
	
	double weight;
	
	BOX_DEMO(double w,double h,double d,double w1)
	{
//		   width=w;
//		   height=h;
//		   depth=d;
		   super(w,h,d);
		   weight=w1;
	}
}
