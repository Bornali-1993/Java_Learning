package practice.bornali.programs;

public class LinkedListOperations {
	public static class Node {
		int data;
		public Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	Node head;

	// Traversing the List
	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.print("\n");

	}

	// Inserting new node at first of the list
	public void insertAtFirst(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	// Inserting new node at random position
	public void insertAfterRandom(Node prev_node, int new_data) {
		Node new_node = new Node(new_data);
		if (prev_node == null) {
			System.out.println("Previous node cannot be null");
			return;
		}
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	// Inserting new node at last position
	public void insertAtLast(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new_node;
			return;
		}
		new_node.next = null;
		Node n = head;
		while (n.next != null)
			n = n.next;
		n.next = new_node;
	}
}
