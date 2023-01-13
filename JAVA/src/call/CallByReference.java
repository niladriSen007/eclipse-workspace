package call;

public class CallByReference {

	public static void main(String[] args) {
		
		TEST1 obj=new TEST1(10,20);


		System.out.println("A and B BEFORE Function Call=>"+obj.a+" "+obj.b);
		obj.meth(obj);
		System.out.println("A and B AFTER Function Call=>"+obj.a+" "+obj.b);

	}

}
