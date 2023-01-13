package power;
import java.util.*;
public class POWER {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		power2(2,6);
	}

	 static void power2(int x,int y)
		{
			int power=1;
			for(int i=1;i<=y;i++)
			{
				power*=x;
			}
			System.out.println(power);
		}
		
	}

	
	
	


