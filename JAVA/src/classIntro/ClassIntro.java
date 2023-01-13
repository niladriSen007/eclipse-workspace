package classIntro;
import java.util.Scanner;
class cat{
	int legs,eyes;
	public void walk() {
		System.out.println("The Cat Is Walking");
	}
	public void eat()
	{
		System.out.println("The Cat Is Eating");
	}
	public void description()
	{
		System.out.println("The Cat Has "+legs+" legs and "+eyes+" eyes");
	}
}
class dog
{
	String color;
	public void run()
	{
		System.out.println("The Dog Is Running");
	}
	public void sleep()
	{
		System.out.println("The Dog Is Sleeping");
	}
	public void description()
	{
		System.out.println("The Dogs Color Is="+color);
	}
}
public class ClassIntro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        cat cat1=new cat();
        cat cat2=new cat();
        
        cat1.legs=4;
        cat1.eyes=2;
        
        cat2.legs=4;
        cat2.eyes=1;
        
        cat1.walk();
        cat1.eat();
        
        cat2.eat();
        cat2.walk();
        
        cat1.description();
        cat2.description();
        
        dog dog1=new dog();
        
        dog1.color="red";
        dog1.run();
        dog1.sleep();
        
        dog1.description();
	}

}
