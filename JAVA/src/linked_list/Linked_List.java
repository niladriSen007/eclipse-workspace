package linked_list;

import java.util.LinkedList;
public class Linked_List {

	public static void main(String[] args) {
		
		LinkedList<String> l1=new LinkedList<>();
		
		
		l1.add("i");
		l1.add("l");
		l1.add("a");
		l1.add("d");
		l1.add("r");		
		System.out.println("Contents of Linked List="+l1);
		l1.addLast("i");
	    l1.addFirst("N");
	    System.out.println("Contents of Linked List="+l1);
	    l1.add("p");
	    System.out.println("Contents of Linked List="+l1);
	    l1.remove("p");
	    System.out.println("Contents of Linked List="+l1);
	    l1.addFirst("x");
	    System.out.println("Contents of Linked List="+l1);
	    l1.remove(0);
	    System.out.println("Contents of Linked List="+l1);
	    l1.addFirst("M");
	    l1.addLast("X");
	    System.out.println("Contents of Linked List="+l1);
	    l1.removeFirst();
	    System.out.println("Contents of Linked List="+l1);
	    l1.removeLast();
	    System.out.println("Contents of Linked List="+l1);
	    String val=l1.get(3);
	    System.out.println("element="+val);
	    l1.set(0, val);
	    System.out.println("Contents of Linked List="+l1);
	    l1.set(0, "N");
	    System.out.println("Contents of Linked List="+l1);
	   
	}

}
