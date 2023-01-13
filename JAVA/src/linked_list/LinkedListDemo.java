package linked_list;

public class LinkedListDemo<E>{

	Node<E> head;
	
	  public void add(E i)
	    {
	    	Node<E> toAdd=new Node<E>(i);
	    	
	    	if(isEmpty())
	    	{
	    		head=toAdd;
	    		return;
	    	}
	    	Node<E> temp=head;
	    	while(temp.next!=null)
	    	{
	    		temp=temp.next;
	    	}
	    	temp.next=toAdd;
	    }
	    public boolean isEmpty()
	    {
	    	return (head==null);
	    }
	    public E removeLast()throws Exception
	    {
	    	Node<E> temp=head,p = null;
	    	
	    	if(temp==null)
	    		throw new Exception("Cant Remove Last Element");
	    	if(temp.next==null)
	    	{
	    		Node<E> toRemove=head;
	    		head=null;
	    		return toRemove.data;
	    	}
	    	while(temp.next!=null)
	    	{
	    		p=temp;
	    		temp=temp.next;
	    	}
	    	Node<E> toRemove=temp;
	    	p.next=null;
	    	return toRemove.data;
	    }
	    public void print()
	    {
	    	Node<E> temp=head;
	    	if(isEmpty())
	    		System.out.println("Empty List");
	    	else
	    	{
	    		while(temp==null)
	    		{
	    			System.out.println(temp.data+" ");
	    			temp=temp.next;
	    		}
	    		
	    	}
	    }
	    public E getLast()throws Exception
	    {
            Node<E> temp=head;
	    	
	    	if(temp==null)
	    		throw new Exception("Cant peek Last Element");
	    	if(temp.next==null)
	    	{
	    		Node<E> toRemove=head;
	    		return toRemove.data;
	    	}
	    	while(temp.next!=null)
	    	{	    		
	    		temp=temp.next;
	    	}
	    	
	    	return temp.data;
	    }
		 
		static class Node<E>
		{
			E data;
			Node<E> next;
			
			public Node(E data)
			{
				this.data=data;
				next=null;
			}
		}

	}


