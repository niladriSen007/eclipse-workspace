package assignment4;
import java.util.*;
public class solFLIGHT {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No Of Flights=>");
		int n=sc.nextInt();
		FLIGHT plane[]=new FLIGHT[n];
		
		for(int i=0;i<n;i++)
		{
			sc.nextLine();
			System.out.println("Enter The Flight Id=>");
			String fId=sc.nextLine();
			System.out.println("Enter The  Departure From=>");
			String DepFrom=sc.nextLine();
			System.out.println("Enter The Departure To=>");
			String DepTo=sc.nextLine();
			System.out.println("Enter The  Duration=>");
			float dur=sc.nextFloat();
			System.out.println("Is Meal Available??");
			boolean meal=sc.nextBoolean();
			
			plane[i]=new FLIGHT(fId,DepFrom,DepTo,dur,meal);
			
		}
		FLIGHT details[]=details(plane);
		System.out.println("The Available Flights With Less Than 2 Hr Journey=>");
		for(FLIGHT flight : details)
		{
			System.out.println("Flight Id=> "+flight.FlightId+" \nFlight  Departure Arrival=> "+flight.DepartureFrom+" \nFlight Departure Destination=> "+flight.DepartureTo);
		}
		FLIGHT ascending[]=ascending("kolkata","pune",plane);
		System.out.println("The Ascending List Of Planes Are");
		for(FLIGHT asc:ascending)
		{
			System.out.println("Flight Id=> "+asc.FlightId+" \nFlight  Departure Arrival=> "+asc.DepartureFrom+" \nFlight Departure Destination=> "+asc.DepartureTo+" \nFlight Departure Destination=> "+asc.Duration);
		}

	}
	public static FLIGHT[] details(FLIGHT plane[])
	{
		int index=0,i,j;
		for(int i1=0;i1<plane.length;i1++)
		{
			if(plane[i1].Duration>2 && plane[i1].MealAvailable==true)
			{
				index++;
			}
		}
		FLIGHT yes[]=new FLIGHT[index];
		for(j=0,i=0;i<plane.length;i++)
		{
			if(plane[i].Duration>2 && plane[i].MealAvailable==true)
			{
					yes[j]=new FLIGHT(plane[i].FlightId,plane[i].DepartureFrom,plane[i].DepartureTo,plane[i].Duration,plane[i].MealAvailable);
					j++;
			}
		}
		
		return yes;
	}
	public static FLIGHT[] ascending(String DepFrom,String DepTo,FLIGHT plane[])
	{
		int index=0;
		for(int i2=0;i2<plane.length;i2++)
		{
//			System.out.println("hiiii");
//			System.out.println(DepFrom);
			if(plane[i2].DepartureFrom.equals(DepFrom) && plane[i2].DepartureTo.equals(DepTo))
			{
				index++;
			}
		}
		System.out.println(index);
		FLIGHT ascend[]=new FLIGHT[index];
//		System.out.println("hi");
		int i,j;
		for(j=0,i=0;i<plane.length;i++)
		{
			if(plane[i].DepartureFrom.equals(DepFrom)&& plane[i].DepartureTo.equals(DepTo))
			{
				ascend[j]=new FLIGHT(plane[i].FlightId,plane[i].DepartureFrom,plane[i].DepartureTo,plane[i].Duration,plane[i].MealAvailable);
				j++;
//				System.out.println(ascend[j].DepartureFrom+" "+ascend[j].DepartureTo);
//				System.out.println("hello");
			}
			
		}
		
		for(int k=0;k<index;k++)
		{
//			System.out.println("hi");
			for(int l=0;l<index-k-1;l++)
			{
//				System.out.println("hi222222");
				if(ascend[l].Duration > ascend[l+1].Duration)
				{
					FLIGHT t=ascend[l];
					ascend[l]=ascend[l+1];
					ascend[l+1]=t;
				}
//				System.out.println(ascend[l].Duration);
			}
		}
		return ascend;
	}

}
