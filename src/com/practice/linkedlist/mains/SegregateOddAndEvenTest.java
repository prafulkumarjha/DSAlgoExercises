package com.practice.linkedlist.mains;

import com.practice.linkedlist.services.LinkedList;
import com.practice.linkedlist.services.SegregateOddAndEven;
import com.practice.node.Node;

/**
 * @author Praful Jha
 *
 */
public class SegregateOddAndEvenTest {

	public static void main(String args[]) {
	LinkedList llist = new LinkedList(); 
	llist.push(11);
    llist.push(10);
    llist.push(9);
    llist.push(6);
    llist.push(4);
    llist.push(1);
     
    Node head = llist.push(0);
     
    System.out.println("Origional Linked List");
    llist.printList(head);

    SegregateOddAndEven oddEvenList = new SegregateOddAndEven(head);
    oddEvenList.segregateOddAndEven();

    System.out.println("Modified Linked List");
    llist.printList(head);
	}
}
