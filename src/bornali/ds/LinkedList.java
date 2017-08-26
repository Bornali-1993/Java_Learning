package bornali.ds;

public class LinkedList implements DataStructures {
	public static class Node {
		public int data;
		public Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	public Node head;

	public LinkedList(int[] arr) {
		Node node = null;
		for (int i = 0; i < arr.length; i++) {
			if (head == null) {
				head = new Node(arr[i]);
				node = head;
			} else {
				node.next = new Node(arr[i]);
				node = node.next;
			}
		}
	}

	@Override
	public void insertion(int size, int insert, int pos) {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		Node n = head;
		int counter = 0;
		while (n != null) {
			counter = counter + 1;
			System.out.println("Node " + counter + " => " + "DATA : " + n.data + ", NEXT : " + n.next);
			n = n.next;
		}

	}

	@Override
	public int search() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

}
