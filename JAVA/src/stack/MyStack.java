package stack;
import linked_list.LinkedListDemo;
public class MyStack <E>{

	private LinkedListDemo<E> ll1=new LinkedListDemo<E>();
	
	void push(E e)
	{
		ll1.add(e);
	}
	E pop() throws Exception
	{
		if(ll1.isEmpty())
			throw new Exception("Popping From Empty Stack Is Not Possible");
		return ll1.removeLast();
	}
	E peek() throws Exception
	{
		return ll1.getLast();
	}

}
