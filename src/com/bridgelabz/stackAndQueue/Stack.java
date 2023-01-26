package com.bridgelabz.stackAndQueue;

public class Stack {
	LinkedList list = new LinkedList(); 

	// add method
	public void push(Object data) {
		list.peakLast(data);
	}

	// display method
	public void display() {
		list.display();
	}

	// Pop method
	public void pop() {
		list.popFirst();
	}

	public static void main(String[] args) {
		System.out.println("welcome to stack program");

		Stack stack = new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
	}
}
