package inheritence2;

public class BOX_DEMO1 extends BOX1{

	double weight;
	BOX_DEMO1()
	{
		super();
		weight=-1;
	}
	 BOX_DEMO1(double w,double h,double d,double w1)
	 {
		 super(w,h,d);
		 weight=w1;
	 }
	BOX_DEMO1()
}
