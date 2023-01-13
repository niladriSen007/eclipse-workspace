package inheritence;

public class MainClass {

	public static void main(String[] args) {
		
		
		Teacher t=new Teacher();
		t.name="NIL";
		t.eat();
		t.teach();
		t.walk();
		
		Singer s=new Singer();
		s.name="Ankita";
		s.eat();
		s.walk();
		s.sing();
		
		
		Student s1=new Student();
		s1.name="priya";
		s1.walk();
		s1.eat();
		s1.teach();
		s1.learn();

	}

}
