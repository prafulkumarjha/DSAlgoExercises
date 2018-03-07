package com.practice.linkedlist.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.practice.node.Node;

/**
 * @author Praful Jha
 *
 */
public class IntersectionLinkedList {

	public Node intersectionOfLLists(Node head1, Node head2) {
		List<Integer> list = new ArrayList<Integer>();
		Node ptr1 = head1;
		Node ptr2 = head2;
		
		System.out.println("List 1 ");
		while(ptr1 != null) {
			System.out.print(ptr1.data+" ");
			ptr1 = ptr1.next;
		}
		System.out.println();
		System.out.println("List 2 ");
		while(ptr2 != null) {
			System.out.print(ptr2.data+" ");
			ptr2 = ptr2.next;
		}
		ptr2 = head2;
		ptr1 = head1;
		while(ptr2 != null)  {
			ptr1 = head1;
			while(ptr1 != null) {
				if(ptr2.data == ptr1.data) {
					System.out.print(ptr2.data+" ");
					list.add(ptr2.data);
				}
				ptr1 = ptr1.next;
			}
			ptr2 = ptr2.next;
		}
		System.out.println();
		Collections.sort(list);
		LinkedList newList = new LinkedList();
		Node node = null;
		for (Integer data : list) {
			 node = newList.push(data);
		}
		
		return node;
	}
}
