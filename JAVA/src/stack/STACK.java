package stack;
import java.util.*;
class STACK1
{
	private int tos;
	private int stack[];
	
	STACK1(int size)
	{
		stack=new int[size];
		tos=-1;
	}
	
	//push an item
	void push(int item)
	{
		if(tos==stack.length-1) System.out.println("Stack Is Full");
		else
		{
			tos++;
			stack[tos]=item;
		}
	}
	
	//pop an item
	int pop()
	{
		if(tos<0)
		{
			 System.out.println("StackUnderflow");
			 return 0;
		}
		else
		{
			
			return stack[tos--];
			
		}
	}
}

public class STACK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The First Stack Size");
		int n1=sc.nextInt();
		
		System.out.println("Enter The Second Stack Size");
		int n2=sc.nextInt();
		
		STACK1 myStack1=new STACK1(n1);
		STACK1 myStack2=new STACK1(n2);
		
		//push some numbers into the stack
		System.out.println("Enter the fiest stack elements");
		System.out.println("elments are");
		for(int i=0;i<n1;i++)
		{
			
			int element=sc.nextInt();
			myStack1.push(element);
		}
		
		System.out.println("Enter the second stack element");
		System.out.println("elements are=");
		for(int j=0;j<n2;j++) 
		{
			
			int stackElement=sc.nextInt();
			myStack2.push(stackElement);
		}
		
		//pop an item from the stack
		System.out.println("Stack in Mystack1\n");
		for(int i=0;i<n1;i++)
			System.out.print("["+myStack1.pop()+"]->");
		System.out.println("\nStack in Mystack2");
		for(int i=0;i<n2;i++)
			System.out.print("["+myStack2.pop()+"]->");

	}

}
