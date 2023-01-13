package stackCLASS;

public class Stack {
	int stack[]=new int[10];
	int tos;
	
	//INITIALIZE TOP OF STACK
	
	Stack()
	{
		tos=-1;
	}
	
	//PUSH AN ITEM ONTO THE STACK
	void push(int item)
	{
		if(tos==9)
		{
			System.out.println("Stack Is Full");
		}
		else
		{
			tos++;
			stack[tos]=item;
			
		}
	}
	//POP AN ITEM FROM THE STACK
	int pop()
	{
		if(tos<0)
		{
			System.out.println("Stack Is Empty");
			return 0;
		}
		else
		{
			return stack[tos--];
		}
	}

}
