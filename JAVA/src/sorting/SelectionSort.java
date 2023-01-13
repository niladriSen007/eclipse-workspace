package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {3,1,4,2,-4,0};
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
				
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i:a)
		{
			System.out.print(i+" ");
		}

	}

}
