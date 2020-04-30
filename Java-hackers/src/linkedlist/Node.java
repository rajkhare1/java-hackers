package linkedlist;

public class Node {
  
	 // Properties
	private Node next;
	private int data;
	
	// Constructors
	public Node(int newData) {
		this.data = newData;
		this.next = null;
	}
	
	public Node(int newData, Node newNext) {
		this.next = newNext;
		this.data = newData;
	}
	
	// Getters and Setters
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setData(int newData) {
		this.data = newData;
	}
	
	public void setNext(Node newNext) {
		this.next = newNext;
	}
	
	
}
