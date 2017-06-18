package com.practice.linkedlist.services;

import com.practice.node.Node;

/**
 * @author Praful Jha
 *
 */
public class LinkedList {

	Node head = null;
	 /*  Given a reference (pointer to pointer) to the head
    of a list and an int, push a new node on the front
    of the list. */
public Node push(int new_data)
{
    /* 1 & 2: Allocate the Node &
              Put in the data*/
    Node new_node = new Node(new_data);

    /* 3. Make next of new Node as head */
    new_node.next = head;

    /* 4. Move the head to point to new Node */
    head = new_node;
    
    return head;
    
}


// Utility function to print a linked list
public void printList()
{
    Node temp = head;
    while(temp != null)
    {
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    System.out.println();
}

}
