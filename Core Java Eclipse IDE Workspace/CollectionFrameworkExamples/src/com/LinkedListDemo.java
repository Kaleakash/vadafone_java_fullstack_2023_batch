package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll =new LinkedList();
		ll.add(10);		// node created : double linked list node created 
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		ll.add(1, 100);
		ll.remove(3);
		Integer n = 40;
		ll.remove(n);
		System.out.println(ll);
		ll.addFirst(111);
		ll.addLast(222);
		System.out.println(ll);
		System.out.println(ll.contains(100));
	}

}
