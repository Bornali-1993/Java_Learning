package practice.bornali.programs;

import practice.bornali.programs.LinkedListOperations.*;

public class LinkedListOperationMain {
	public static void main(String[] args) {

		// Creating the LinkedList
		LinkedListOperations list = new LinkedListOperations();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);

		// Linking all the nodes of the LinkedList
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = null;

		// Performing all the operations in LinkedList
		list.printList();
		list.insertAtFirst(5);
		list.insertAfterRandom(second, 5);
		list.insertAtLast(5);
		list.printList();
	}

}
