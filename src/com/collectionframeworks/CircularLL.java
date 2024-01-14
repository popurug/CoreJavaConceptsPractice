package com.collectionframeworks;

public class CircularLL {

	public class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	public static void main(String[] args) {
		CircularLL clist = new CircularLL();
		clist.add(1);
		clist.add(2);
		clist.add(3);
		clist.add(4);
		clist.add(5);
		clist.add(6);
	}
}
