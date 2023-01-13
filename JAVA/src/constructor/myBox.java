package constructor;

public class myBox {

	public static void main(String[] args) {
		BOX myBox1=new BOX();
		BOX myBox2=new BOX(4,5,6);
	    BOX myBox3=new BOX(myBox2);
		BOX myBox4;
		myBox4=myBox3;  //space allocate holona ei object tar jonne
		
		System.out.println(myBox1.volume());
		System.out.println(myBox2.volume());
        System.out.println(myBox3.volume());
	}

}
