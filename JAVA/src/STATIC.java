

class static1{
	
	int num1;
	static int num2;
	
	public static void show()
	{
//		num1=8;error
		num2=9;
	}
}


public class STATIC {

	public static void main(String[] args) {
		
		static1 ob=new static1();
		static1 ob1=new static1();
		
		ob.num1=3;
		ob1.num1=5;
		
		static1.show();
		System.out.println(static1.num2);
		System.out.println(ob.num2);
		System.out.println(ob1.num2);

	}

}