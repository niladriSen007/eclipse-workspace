package inheritencePractice;

public class B extends A{
	private int k;
	
	public void showK()
	{
		
		System.out.println("The Value Of K Is=>"+k);
	}
	public void sum1()
	{
		System.out.println("The Sum Is=>"+(sum()+k));
	}
	public void input1()
	{
		input();
		System.out.println("Enter The Value Of K");
		k=sc.nextInt();
	}

} 
