package assignment2;
import java.util.Scanner;


public class solutionBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The No Of Books");
      int n=sc.nextInt();
      BOOK b[]=new BOOK[n];
      for(int i=0;i<n;i++)
      {
    	  System.out.println("Enter The Book Id=>");
    	  int id=sc.nextInt();
    	  sc.nextLine();
    	  System.out.println("Enter The Book tITLE=>");
    	  String title=sc.nextLine();
//    	  sc.nextLine();
    	  System.out.println("Enter The Book Author=>");
    	  String author=sc.nextLine();
    	  System.out.println("Enter The Book Price=>");
    	 double price=sc.nextDouble();
    	 
    	 b[i]=new BOOK(id,title,author,price);
      }
      
      double totalPrice=totalPrice(b);
      System.out.println("Total Price=>"+totalPrice);
      
      BOOK final1[]=AscendingBook(100,500,b);
      System.out.println("Ascending Order Book=>");
	for(BOOK books:final1)
      {
    	  System.out.println("BOOK ID=>"+books.getId()+" BOOK TITLE=>"+books.getTitle()+" BOOK AUTHOR=>"+books.getAuthor()+" BOOK PRICE=>"+books.getPrice());
      }
	}

	public static double totalPrice(BOOK b[])
	{
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			sum+=b[i].getPrice();
		}
		return sum;
	}
	public static BOOK[] AscendingBook(double min,double max,BOOK b[])
	{
		int i1,j,index=0;
		for(int i=0;i<b.length;i++)
		{
		
			if(b[i].getPrice()>min && b[i].getPrice()<max)
			{
				index++;
			}
		}
		BOOK books[]=new BOOK[index];
		for(j=0,i1=0;i1<b.length;i1++)
		{
			;
			if(b[i1].getPrice()>min && b[i1].getPrice()<max)
			{
				books[j]=new BOOK(b[i1].getId(),b[i1].getTitle(),b[i1].getAuthor(),b[i1].getPrice());
				j++;
			}
		}
		
		for(int k=0;k<books.length;k++)
		{
			for(int v=0;v<books.length-k-1;k++)
			{
				if(books[v].getPrice()>books[v+1].getPrice())
				{
					BOOK t=books[v];
					books[v]=books[v+1];
					books[v+1]=t;
				}
			}
		}
		return(books);
	}
}
