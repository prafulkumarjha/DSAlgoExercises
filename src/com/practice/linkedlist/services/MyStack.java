/**
 * 
 */
package com.practice.linkedlist.services;

import java.util.EmptyStackException;

import com.practice.node.Node;

/**
 * @author Praful Jha
 *
 */
public class MyStack {

	Node start = null;

	public MyStack() {
		super();
		
	}
	
	public void push(int data) {
		
		Node newNode = new Node(data);
		newNode.next = start;
		start = newNode;
	}
	
	public int pop() { 
		if(start == null)
			return -1;
		
		Node popped_node = start;
		start = start.next;
		return popped_node.data;
	}
	
	public int peek() {
		if(start == null)
			throw new EmptyStackException();
		return start.data;
	}
	
	public boolean isEmpty() {
		
		if(start == null)
			return true;
		
		return false;
					
	}
	
	public int size() {
		Node temp = start;
		int len = 0;
		while(temp!= null) {
			len++;
			temp = temp.next;
		}
		return len;
	}
}
