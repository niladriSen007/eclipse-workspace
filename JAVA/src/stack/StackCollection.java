package stack;
//import java.util.Stack;
import stack.MyStack;
public class StackCollection {

	public static void main(String[] args) throws Exception {
		
//		Stack<Integer> stack=new Stack<>();
		MyStack<Integer> stack=new MyStack<Integer>();
		
		
		stack.push(16);
		stack.push(17);
		stack.push(18);
		
		int popped=stack.pop();
		System.out.println(popped);
		
		int peek=stack.peek();
		System.out.println(peek);
		

	}

}
