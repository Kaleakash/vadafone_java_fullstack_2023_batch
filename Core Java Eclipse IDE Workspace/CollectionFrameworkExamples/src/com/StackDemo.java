package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ss = new Stack();
		ss.push(10);			// to add 
		ss.push(20);
		ss.push(30);
		ss.push(40);
		ss.push(50);
		System.out.println(ss);
		System.out.println(ss.pop());	// remove top most element 
		System.out.println(ss);
		System.out.println(ss.peek());  // it check only top most element but not remove 
		System.out.println(ss);
		System.out.println(ss.search(40));   // position of element count from top from 1
		System.out.println(ss.search(400)); // if not present return -1
		System.out.println(ss.size());
 	}

}
