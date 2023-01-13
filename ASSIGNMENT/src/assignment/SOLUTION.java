package assignment;
import java.util.Scanner;
public class SOLUTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The No Of Products");
       int n=sc.nextInt();
       PRODUCT p[]=new PRODUCT[n];
       
       for(int i=0;i<n;i++)
       {
    	   System.out.println("Enter The Product Id");
    	   int pId=sc.nextInt();
    	   sc.nextLine();
    	   System.out.println("Enter The Product Name");
    	   String pName=sc.nextLine();
    	  
    	   System.out.println("Enter The Product Quantity");
    	   double quantity=sc.nextDouble();
    	   System.out.println("Enter The Product Price");
    	   double price=sc.nextDouble();
    	   
    	    p[i]=new PRODUCT( pId, pName, quantity, price);
    	    
    	    
//    	   p[i].setProductId(pId);
//    	   p[i].setProductName(pName);
//    	   p[i].setQuantity(quantity);
//    	   p[i].setPrice(price);
           }
      
       int totalPrice=CalculateTotalPrice(p);
       System.out.println("Total Price=>"+totalPrice);
       
       PRODUCT final1[]=DescendingPrice(p);
       System.out.println("Descending Order Is=>");
       for(PRODUCT p2 : final1)
       {
    	   System.out.println(p2.getProductName()+" "+p2.getPrice());
       }
	}
	

	public static int CalculateTotalPrice(PRODUCT p[])
	{
		int sum=0;
		for(int i=0;i<p.length;i++)
		{
			sum+=(p[i].getQuantity()*(p[i].getPrice()));
			
		}
		return sum;
	}
    public static PRODUCT[] DescendingPrice(PRODUCT p[])
    {
    	for(int i=0;i<p.length-1;i++)
    	{
    		for(int j=0;j<p.length-i-1;j++)
    		{
    			if(p[j].getPrice()<p[j+1].getPrice())
    			{
    				PRODUCT p1=p[j];
    				p[j]=p[j+1];
    				p[j+1]=p1;
    			}
    		}
    	}
    	return p;
    }
}
