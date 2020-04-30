package queuey;

import java.util.LinkedList;

public class Queuey<T> {
	
	LinkedList<T> queue;
	
	// Making a queue instance
	public Queuey() {
		this.queue = new LinkedList();
	}

	// Instance Methods
	
	// Is out queue is empty?
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	// What is the size of our queue?
	public int size() {
		return queue.size();
	}
	
	// Enqueuing an item
	public void enqueue(T  n) {
		queue.addLast(n);
	}
	
	// Dequeuing an item
	public T dequeue() {
		return queue.remove(0);
	}
	
	// Peek at the first item
	public T peek() {
		return queue.get(0);
	}
	
	// iterate the Queue
	public void displayQueuey() {
		System.out.print("[ ");
	for(Object number : queue) {
		System.out.print(number+" ");
	}
	System.out.println("]");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queuey numberQueue =  new Queuey();
		numberQueue.enqueue(5);
		numberQueue.enqueue(7);
		numberQueue.enqueue(6);
		numberQueue.displayQueuey();
		numberQueue.dequeue();
		numberQueue.dequeue();
		numberQueue.displayQueuey();

	}

}
