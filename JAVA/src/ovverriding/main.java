package ovverriding;

public class main {

	public static void main(String[] args) {
		A ob=new A();
		B ob1=new B();
		C ob2=new C();
		
		A r1;
		r1=ob;
		r1.CallMe();
		
		r1=ob1;
		ob1.CallMe();
		
		r1=ob2;
		ob2.CallMe();

	}

}
