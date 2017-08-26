import bornali.ds.LinkedList.Node;

public class LinkedListOperations {

	// Creation of Linked List:
	public static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;

		}
	}

	Node head;

	// Function for printing the Linked List:
	public void print() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	
	// Function for inserting the Linked List:
	public void PushFirst(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperations list = new LinkedListOperations();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		// Linking the Linked List:
		list.head.next = second;
		second.next = third;
		third.next = null;

		// Printing the Linked List:
		list.print();
		list.PushFirst(4);
		list.print();

	}

}
