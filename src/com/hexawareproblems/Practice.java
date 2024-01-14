package com.hexawareproblems;

//import com.collectionframeworks.SinglyLinkedList;

public class Practice {

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();
		list.append("1");
		list.append("2");
		list.append("3");
		list.append("4");
		
		System.out.println("linked list: " + list);
		
		System.out.println("The first node from last: " + list.getLastNode(1));
		System.out.println("The second node from the end: " + list.getLastNode(2));
		System.out.println("The third node from the tail: " + list.getLastNode(3));
	}

}
