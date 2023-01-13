package abstraction;

public class RepairShop {

	public static void RepairShop(Car car)
	{
		System.out.println("car Is Repairing");
	}
	public static void main(String[] args) {
		
	WagonR wagonR=new WagonR();
	Audi audi=new Audi();
	
	// Car obj=new Car(); WE CANT CREATE AN OBJECT FROM AN ABSTRACT CLASS 
	
	RepairShop(wagonR);
	RepairShop(audi);
   
	}

}
