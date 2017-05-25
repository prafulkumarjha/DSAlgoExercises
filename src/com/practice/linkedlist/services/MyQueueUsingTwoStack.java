/**
 * 
 */
package com.practice.linkedlist.services;

/**
 * @author Praful Jha
 *
 */
public class MyQueueUsingTwoStack {

	MyStack stack1 = new MyStack();
	MyStack stack2 = new MyStack();
	public void enQueue(int data) {
		
		stack1.push(data);	
	}
	
	public int deQueue() {
		
		if(stack2.isEmpty()) {
		while(!stack1.isEmpty())
			stack2.push(stack1.pop());
		}
		
		return stack2.pop();
		
	}
	
	public boolean isEmpty() {
		
		if(stack1.isEmpty() && stack2.isEmpty())
			return true;
		return false;
	}
	
	public int size() {
		
		if(isEmpty())
			return 0;
		
		return stack1.size()+stack2.size();
		
		
	}
}
