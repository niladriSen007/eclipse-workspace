package exception;

public class TryCatch {

	public static void main(String[] args) {
//	
		try{
			int a=5;
		
		int b=0;
		int c=a/b;
			System.out.println(c);
			int a2[]=new int[4];
			System.out.println(a2[5]);
		
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" is occured");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+" is occured");
		}catch(NullPointerException e) {
			System.out.println(e.getMessage()+" is occured");
		}catch(VirtualMachineError e) {
			System.out.println(e.getMessage()+" is occured");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+" is occured");
		}finally {
			System.out.println("sorry!!!!!for the inconveniences");
		}
		System.out.println("IMPORTANT");
		sum();
	}
	
static void sum() {
	int a=5,b=3;
	int c=a/b;
	System.out.println(c);
	try {
		sum1();
	}catch(Exception e) {
		System.out.println(e.getMessage()+" is occured");
	}

	}
static void sum1() {
	boolean isDanger=true;
	if(!isDanger) {
		throw new ArrayIndexOutOfBoundsException("Danger Was Coming");
 }
}
}
