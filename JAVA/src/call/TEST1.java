package call;

public class TEST1 {

	int a,b;
	
	TEST1(int i,int j)
	{
		a=i;
		b=j;
	}
	void meth(TEST1 ob)
	{
		ob.a*=2;
		ob.b/=2;
	}
}
