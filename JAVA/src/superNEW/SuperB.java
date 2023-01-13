package superNEW;

public class SuperB extends SuperA{

	int a;
	SuperB(int x,int y)
	{
		super.a=x;
		this.a=y;
	}
	 void printSuper()
	 {
		 System.out.println("value of a in SuperA=>"+super.a);
		 System.out.println("value of a in SuperB=>"+a);
	 }
}
