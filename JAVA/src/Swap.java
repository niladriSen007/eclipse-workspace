
public class Swap {

	public static void main(String[] args) {
		
		int c=34;
		int d=23;
		
		swap(c,d);
		System.out.println(" outer loop c "+c+" d "+d);
		
		

	}
	static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("in loop c "+a+" d "+b);
	}

}
