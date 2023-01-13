package privateINHERITENCE;

public class BOX_DEMO1 extends BOX1{
	
	double weight;
	
	BOX_DEMO1(double w,double h,double b,double w1)
	{
		super(w,h,b);  //CALLS THE PARENT CLASS'S CONSTRUCTOR  MEANS THE BOX1'S CONSTRUCTOR WITH THREE ARGUMENT
		weight=w1;
	}
	BOX_DEMO1(BOX_DEMO1 ob)
	{
		super(ob);
		weight=ob.weight;
	}
	BOX_DEMO1()
	{
		super();
		weight=-1;
	}

}
