package inheritence2;

public class BOX_MAIN {

	public static void main(String[] args) {
		
		double vol;
		BOX_DEMO obj=new BOX_DEMO(1,2,3,4);
		System.out.println(obj.volume());
		
		BOX_DEMO obj1=new BOX_DEMO(10,20,30,40);
        System.out.println( obj1.volume());
         
         
        BOX_DEMO obj2=new BOX_DEMO(2,3,4,5);
        BOX plainBox=new BOX();
        System.out.println("Before creating interface volume of PlainBox=>" + plainBox.volume());
        plainBox=obj2;
        System.out.println("After creating interface volume of PlainBox=>" + plainBox.volume());
	}

}
