package bornali.ds.test;

import bornali.ds.LinkedList;
import bornali.ds.LinkedList.Node;

public class LinkedList_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList(new int[]{10,20,30,40,50,60,70,80,90});
//		list.head = new Node(1);
//		list.head.next = new Node(2);
//		list.head.next.next = new Node(3);
//		list.head.next.next.next = new Node(4);		
		list.print();
	}

}
