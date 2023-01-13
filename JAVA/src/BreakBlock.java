
public class BreakBlock {

	public static void main(String[] args) {
		boolean t=true;
		first:
		{
			second:
			{
			  third:
			  {
			    System.out.println("BEFORE BREAK");
			    if(t)
			    	break second;
			    System.out.println("THIS IS AFTER BREAK");
			  }
		      System.out.println("THIS IS BEFORE THIRD BLOCK");
			}
		System.out.println("THIS IS BEFORE SECOND BLOCK");
		}

	}

}
