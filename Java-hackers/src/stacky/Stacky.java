package stacky;

import java.util.LinkedList;

public class Stacky {
	
	LinkedList stack;
	
	// Initialize the stack
	public Stacky() {
		this.stack = new LinkedList();
	}
	
	// Instance Methods
	// Is stack empty?
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int peek() {
		return (int) stack.getLast();
	}
	
	// Push an item
	public void push(int n) {
		stack.addLast(n);
	}
	
	// Pop an element
	public int pop() {
		return (int) stack.removeLast();
	}
	
	public void displayStack() {
		System.out.print("[ ");
		for(Object item : stack) {
			System.out.print(item+" ");
		}
		System.out.println("]");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacky numberStack = new Stacky();
		numberStack.push(13);
		numberStack.push(2);
		numberStack.push(1);
		numberStack.push(12);
		numberStack.push(11);
		numberStack.displayStack();
		numberStack.pop();
		System.out.println(numberStack.peek());
		numberStack.displayStack();

	}

}
