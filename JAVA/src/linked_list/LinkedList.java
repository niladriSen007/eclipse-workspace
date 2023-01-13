package linked_list;
import java.util.*;

public class LinkedList {

	
	static Node head;
	
	static class Node
	{
		
		int data;
		Node next;
	
	    Node(int d)
	    {
		  data=d;
		  next=null;
	    }
	    
	}
	public static LinkedList insertEnd(LinkedList list)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Element You Want To Insert=");
		int data=sc.nextInt();
		Node new_obj=new Node(data);
		new_obj.next=null;
		Node last=list.head;
		if(list.head==null)
		{
			list.head=new_obj;
			head.next=null;
		}
		else
		{
			
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_obj;
		}
		return list;
	}
	public static LinkedList insertFirst(LinkedList list)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Element You Want To Insert=");
		int data=sc.nextInt();
		Node new_obj=new Node(data);
//		new_obj.next=null;
		
		if(list.head==null)
		{
			list.head=new_obj;
			new_obj.next=null;
		}
		else
		{
			new_obj.next=head;
			head=new_obj;
		}
		return list;
	}
	public static LinkedList insertAtIndex(LinkedList list)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Element You Want To Insert=");
		int data=sc.nextInt();
		Node new_obj=new Node(data);
		if(list.head==null)
		{
			list.head=new_obj;
			new_obj.next=null;
		}
		else
		{
			System.out.println("Enter The Index Where You Want To Insert");
			int index=sc.nextInt();
			int i=0;
			Node last=list.head;
			while(i<index-1)
			{
				last=last.next;
				i++;
			}
		
			new_obj.next=last.next;
			last.next=new_obj;
			
		}
		return list;
		
	}
	public static LinkedList insertAfterAnyIndex(LinkedList list)
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Element You Want To Insert=");
		int data=sc.nextInt();
		Node new_obj=new Node(data);
		if(list.head==null)
		{
			list.head=new_obj;
			new_obj.next=null;
		}
		else
		{
			System.out.println("Enter The Index After Which You Want To Insert");
			int index=sc.nextInt();
			int i=0;
			Node last=list.head;
			while(i<index)
			{
				last=last.next;
				i++;
			}
		
			new_obj.next=last.next;
			last.next=new_obj;
			
		}
		return list;
		
	}
	
	public static void printList(LinkedList list)
	{
		Node presentNode=list.head;
		System.out.println("--------------------Linked List---------------------");
		int i=0;
		while(presentNode!=null)
		{
			
			System.out.print("Element at Index "+i+"is ["+presentNode.data+ "]\n");
			presentNode=presentNode.next;
			i=i+1;
		}
	}
	public static void main(String[] args)
	{
		
		LinkedList list=new LinkedList();
		
		
		
		list=insertFirst(list);
		list=insertFirst(list);
		printList(list);
		list=insertEnd(list);
		list=insertEnd(list);
		list=insertEnd(list);
		printList(list);
		list=insertAtIndex(list);
		printList(list);
		list=insertAfterAnyIndex(list);
		printList(list);
		
	}
	
	
}
