package increment;

public class PrePost {

	public static void main(String[] args) {
		int a=45;
		int b=a;
		int c=a++;
		System.out.println(c);
		c=a;
		System.out.println(c);
		int d=++b;
		System.out.println(d);
		d=b;
		System.out.println(d);
	}

}
