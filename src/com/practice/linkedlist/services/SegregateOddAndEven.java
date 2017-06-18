package com.practice.linkedlist.services;

import com.practice.node.Node;

/**
 * @author Praful Jha
 *
 */
public class SegregateOddAndEven {

	Node head = null;
	
	
	public SegregateOddAndEven(Node head) {
		super();
		this.head = head;
	}


	public void segregateOddAndEven() {
		if(head == null) {
			System.out.println("Empty List");
			return ;
		}
		if(head.next == null) {
			return;
		}
		
		Node ptr = head;
		Node evenHead = null;
		Node oddHead = null;
		Node oddEnd = null;
		
		Node evenEnd = null;
		
		while(ptr != null) {
			if(ptr.data%2 == 0) {
			if(evenHead == null) {
				
				evenHead = ptr;
				evenEnd = evenHead;
			} 
			else {
				evenEnd.next = ptr;
				evenEnd = ptr;
			}
				
			} 
			else {
				if(oddHead == null) {
					
					oddHead = ptr;
					oddEnd = oddHead;
				} 
				else {
					oddEnd.next = ptr;
					oddEnd = ptr;
				}
			}
			ptr = ptr.next;
		}
		evenEnd.next = oddHead;
	}
}
