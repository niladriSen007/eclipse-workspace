
public class NoOfObjects {
	
	static class A{
		static int i;
	    public A()
	    {
	      i++;
	    }
	    
	    void show()
	    {
	    	System.out.println(i);
	    }
	}

    

	public static void main(String[] args) {

		A obj1=new A();
		A obj2=new A();
		A obj3=new A();
	
		obj2.show();
	}

}
