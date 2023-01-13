package arrayList;

public class Pair <X,Y>{
	
	X x;
	Y y;
	Pair(X x1,Y y1)
	{
		this.x=x1;
		this.y=y1;
	}
	
    public void getDescription()
    {
    	System.out.println(x+" and "+y);
    }

}
