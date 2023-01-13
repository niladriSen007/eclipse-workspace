package overloading;

public class FunctionOverloading {

	public static void main(String[] args) {
		int firstNumber,secondNumber;
		
		System.out.println(maxOf(9,14));
		System.out.println(maxOf(91,140,435));

	}
	static int maxOf(int a,int b)
	{
		if(a>b)
			return(a);
		else
			return(b);
	}
	
	static int maxOf(int a,int b,int c)
	{
		if(a>b) {
			if(a>c)
			{
				return a;
			}
			else {
				return c;
			}
		}
		else
		{
			if(b>c)
			{
				return b;
			}
			else
				return c;
		}
	}

}
