package hashSet;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> h1=new HashSet<>();
		h1.add("N");
		h1.add("i");
		h1.add("l");
		h1.add("a");
		h1.add("d");
		h1.add("r");
		h1.add("x");
		System.out.println("Contents of HashSet=>"+h1);
		System.out.println(h1.contains("N"));
		h1.remove("x");
		System.out.println("Contents of HashSet=>"+h1);
        System.out.println("size of HashSet h1="+h1.size());
	}

}
