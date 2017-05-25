/**
 * 
 */
package com.practice.linkedlist.mains;

import com.practice.linkedlist.services.MyQueueUsingTwoStack;

/**
 * @author Praful Jha
 *
 */
public class QueueUsingStacks {

	public static void main(String args[]) {
		MyQueueUsingTwoStack Q = new MyQueueUsingTwoStack();
		Q.enQueue(10);
		Q.enQueue(12);
		Q.enQueue(14);
		System.out.println(Q.size());
		System.out.println(Q.deQueue());
		System.out.println(Q.isEmpty());
		System.out.println(Q.size());
	}
}
