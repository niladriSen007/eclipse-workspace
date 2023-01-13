package stackCLASS;

public class TestStack {

	public static void main(String[] args) {
		Stack myStack1=new Stack();
		Stack myStack2=new Stack();
		
		//PUSH SOME NUMBERS ONTO THE STACK
		for(int i=0;i<10;i++) myStack1.push(i);
		for(int i=10;i<20;i++) myStack2.push(i);
		
		//POP THOSE NUMBERS FROM THE STACK
		System.out.println("Stack In Mystack1=>");
		for(int i=0;i<10;i++) System.out.println(myStack1.pop());
		
		System.out.println("Stack In Mystack2=>");
		for(int i=10;i<20;i++) System.out.println(myStack2.pop());
			

	}

}
