package complex;

public class ca2 {

	public static void main(String[] args) {
		
		ComplexAdd obj=new ComplexAdd(2,3);
		ComplexAdd obj2=new ComplexAdd(4,-5);
		
		int real=obj.real+obj2.real;
		int imaginary=obj.imaginary+obj2.imaginary;
		System.out.println("The Addition is=>"+real+"+"+imaginary+"i");
		
		int real1=obj.real-obj2.real;
		int imaginary1=obj.imaginary-obj2.imaginary;
		System.out.println("The Subtraction is=>"+real1+"+"+"("+imaginary1+"i)");
		
		int real2=(((obj.real*obj2.real)-(obj.imaginary*obj2.imaginary)));
		int imaginary2=((obj.real*obj2.imaginary)+(obj.imaginary*obj2.real));
		System.out.println("The Multiplication is=>"+real2+"+"+"("+imaginary2+"i)");
		
		int real3=(((obj.real*obj2.real)+(obj.imaginary*obj2.imaginary)));
		int imaginary3=((obj.imaginary*obj2.real)-(obj.real*obj2.imaginary));
		float div=(obj2.real*obj2.real)+(obj2.imaginary*obj2.imaginary);
		float realDiv=real3/div;
		float imaginaryDiv=imaginary3/div;
		System.out.println("The DIVISION is=>"+realDiv+"+"+"("+imaginaryDiv+"i)");
	}
	

}
