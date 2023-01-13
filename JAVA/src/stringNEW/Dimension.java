package stringNEW;
class Box
{
	double width,height,depth;

	public Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public String toString()
	{
		return "Dimensions are= "+width+"by "+ depth +"by "+height;
	}
	
}

public class Dimension {

	public static void main(String[] args) {
		Box ob=new Box(10,11,12);
		String s="Box ob:"+ob;
		
		System.out.println(ob);
		System.out.println(s);

	}

}
