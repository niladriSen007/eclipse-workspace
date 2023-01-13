package asignment3;
import java.util.*;


public class solCAKE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No Of Cakes=>");
		int n=sc.nextInt();
		CAKE cakes[]=new CAKE[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter The Cake Id=>");
	    	  int id=sc.nextInt();
	    	  sc.nextLine();
	    	  System.out.println("Enter The Cake Name=>");
	    	  String name=sc.nextLine();
	    	  System.out.println("Enter The Amount Of Cake");
	    	  double amount=sc.nextDouble();
	    	  System.out.println("Enter The Price Per Pound=>");
	    	  double price=sc.nextDouble();
	    	  System.out.println("Is The Cake Eggless???");
	    	  boolean eggLess=sc.nextBoolean();
	    	 
	    	 cakes[i]=new CAKE(id,name,amount,price,eggLess);
		}
//		double totalPrice=totalPrice(cakes);
//        System.out.println("Total Price="+totalPrice);
        
        double cakeBill=generateCakeBill(cakes);
        System.out.println("Total Price="+cakeBill);
        
        CAKE final1[]=getEgglessCakes(cakes);
        System.out.println("EggLess Cake List=>");
        for(CAKE cake :final1)
        {
        	System.out.println("CAKE NAME IS =>"+cake.cakeName+" CAKE ID IS =>"+cake.cakeId+"  CAKE ORDERED =>"+cake.pound+"POUND"+"  CAKE PRICE PER POUND IS =>"+cake.PricePerPound);
        }
	}
//    public static double totalPrice(CAKE cakes[])
//    {
//    	double sum=0;
//    	for(int i=0;i<cakes.length;i++)
//    	{
//    		sum+=(cakes[i].PricePerPound*cakes[i].pound);
//    	}
//    	return sum;
//    }
    public static double generateCakeBill(CAKE cakes[])
    {
    	double sum=0;
    	for(int i=0;i<cakes.length;i++)
    	{
    		if(cakes[i].eggless==true)
    		{
    			sum+=(cakes[i].PricePerPound*cakes[i].pound+50+(2/100));
    		}
    		else
    		{
    			sum+=(cakes[i].PricePerPound*cakes[i].pound);
    		}
    	}
    	return sum;
    	
    }
    public static CAKE[]  getEgglessCakes(CAKE cakes[])
    {
    	
    	int index=0,i,j;
    	for(int i1=0;i1<cakes.length;i1++)
    	{
    		
    		if(cakes[i1].eggless==true)
    		{
    		 index++;
    		}
    		
    	}
//    	System.out.println(index);
    	CAKE eggLess[]=new CAKE[index];
    	for(j=0,i=0;i<cakes.length;i++)
		{
    		if(cakes[i].eggless==true)
    		{
    		 eggLess[j]=new CAKE(cakes[i].cakeId,cakes[i].cakeName,cakes[i].pound,cakes[i].PricePerPound,cakes[i].eggless);
    		 j++;
    		}
		}
    	return eggLess;
		
    }
    
}
