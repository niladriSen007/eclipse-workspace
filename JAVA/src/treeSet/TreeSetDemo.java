package treeSet;
import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> t1=new TreeSet<>();
		t1.add("n");
		t1.add("i");
		t1.add("l");
		System.out.println("contents of TreeSet=>"+t1);
		t1.remove("l");
		System.out.println("contents of TreeSet=>"+t1);
		System.out.println("Size of TreeSet=>"+t1.size());
		System.out.println(t1.contains("n"));
		t1.add("a");
		t1.add("b");
		t1.add("c");
		t1.add("d");
		t1.add("e");
		System.out.println(t1.subSet("a", "e"));
		TreeSet<Integer> t2=new TreeSet<>();
		t2.add(1);
		t2.add(2);
		t2.add(3);
		t2.add(4);
		t2.add(5);
		System.out.println(t2.lower(4));
		System.out.println(t2.floor(4));
        System.out.println(t2.ceiling(4));
        System.out.println(t2.pollFirst());
        System.out.println(t2.pollLast());
        System.out.println(t2.higher(5));
	}

}
