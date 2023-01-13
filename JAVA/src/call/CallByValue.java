package call;

public class CallByValue {

	public static void main(String[] args) {
		
		TESTc ob=new TESTc();
		int a=15,b=20;
		
		System.out.println("A and B BEFORE Function Call=>"+a+" "+b);
		
		ob.meth(10, 30);
		
		System.out.println("A and B AFTER Function Call=>"+a+" "+b);

	}

}
