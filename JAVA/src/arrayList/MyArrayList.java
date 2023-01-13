package arrayList;
import java.util.ArrayList;
import java.util.List;
public class MyArrayList {

	public static void main(String[] args) {
		
		//1st object banalam Pair class er  in arraylist with type <STRING,INTEGER>
		Pair<String,Integer> p1= new Pair("Nil",34);
		System.out.println("x for p1=>"+p1.x);
		System.out.println("y for p1=>"+p1.y);
		
		System.out.println("\n");
		
		//2nd object banalam pair class er with type <Boolen,String>
		Pair<Boolean,String> p2=new Pair(true,"RAJ");
		System.out.println("x for p2=>"+p2.x);
        System.out.println("y for p2=>"+p2.y);
        
    	System.out.println("\n");
        
//        PAIR CLASS GERERIC CLASS E PORINOTO HOLO MANE SPECIFIC TYPE DEFINE KORE DILAM 
//        JE EI TYPE CHARA ONNO KONO PTYPE ER VALUE DEWA JABENA
        
        p1.getDescription();
        p2.getDescription();
        
        
        //ARRAYLIST FUNCTIONS-->add(),addAll(),
        
        List<String> fruits=new ArrayList<>();
        fruits.add("orange");
        fruits.add("Apple");
        System.out.println(fruits);
        
        List<String> fruits1=new ArrayList<>();
        fruits1.add("lemon");
        fruits1.addAll(fruits);
        fruits1.add("blackberry");
        System.out.println(fruits1);
        List<String>toRemove=new ArrayList();
        toRemove.add("lemon");
        
        System.out.println(fruits1.get(1));
        fruits.set(1, "banana");
        System.out.println(fruits);
//        fruits1.remove(2);
//        System.out.println(fruits1);
        fruits1.removeAll(toRemove);
        System.out.println(fruits1);
        fruits.clear();
        System.out.println(fruits);
        System.out.println(fruits1.size());
        System.out.println(fruits1.contains("Apple"));
        System.out.println(fruits1.contains("apple"));
        System.out.println(fruits.isEmpty());
        System.out.println(fruits1.isEmpty());
        System.out.println(fruits1);
        
        
        String temp[]=new String[fruits1.size()];        
        temp=fruits1.toArray(temp);
        for(String i :temp)
        {
        	System.out.print(i+" ");
        }
	}

}
