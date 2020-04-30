package linkedlist;

public class LinkedList {
	
	// Properties
	Node head;
	int count;
	
	// Constructors
//	public LinkedList() {
//		this.head = null;
//		this.count = 0;
//	}
	
	public LinkedList(Node newHead) {
		this.head = newHead;
		this.count = 1;
	}
	
	// Methods
	
	// add
	public void add(int newData) {
		Node temp = new Node(newData);
		Node current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}
	
	// get
	public int get(int index) {
		if(index <= 0) {
			return -1;
		}
		Node current = head;
		for(int i = 1; i < index; i++) {
			current = current.getNext();
		}
		return current.getData();
	}
	
	// size
	public int size() {
		return count;
	}
	
	// isEmpty
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}else {
			return false;
		}
	}
	
	// remove
	public void remove() {
		Node current = head;
		while(current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
		count--;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
