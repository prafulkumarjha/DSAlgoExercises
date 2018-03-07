package com.practice.linkedlist.mains;

import com.practice.linkedlist.services.IntersectionLinkedList;
import com.practice.linkedlist.services.LinkedList;
import com.practice.node.Node;

/**
 * @author Praful Jha
 *
 */
public class IntersectionLinkedListTest {

	public static void main(String args[]) {
		
		LinkedList llist = new LinkedList(); 
		llist.push(9);
	    llist.push(6);
	    llist.push(4);
	    llist.push(2);
	    llist.push(3);
	     
	    Node head1 = llist.push(8);
	    
	    LinkedList llist2 = new LinkedList(); 
		llist2.push(1);
	    llist2.push(2);
	    llist2.push(8);
	    llist2.push(6);	     
	    Node head2 = llist2.push(2);
	    
	    IntersectionLinkedList intersection = new IntersectionLinkedList();
	    Node head3 = intersection.intersectionOfLLists(head1, head2);
	    System.out.println("Intersection of List : ");
	    while(head3 != null) {
	    	System.out.print(head3.data+" ");
	    	head3 = head3.next;
	    }
	}
}
