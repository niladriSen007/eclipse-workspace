package random;
import java.util.Random;
public class RandomArray {

	public static void main(String[] args) {
		int a[]=new int[20];
		Random r=new Random();
		for(int i=0;i<20;i++)
		{
			a[i]=r.nextInt(50);
		}
		for(int i:a)
		{
		System.out.println("random array elements are=>"+i);
		}

	}

}
