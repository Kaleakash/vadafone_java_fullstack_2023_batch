package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

	public static void main(String[] args) {
		// PriorityQueue	FIFO base upon priority 
		
		Queue qq1 = new PriorityQueue();
		qq1.add(3);
		qq1.add(6);
		qq1.add(1);
		qq1.add(10);
		qq1.add(4);
		qq1.add(2);
		qq1.add(8);
		System.out.println(qq1);
		//qq1.poll();
		System.out.println(qq1.poll());  // remove first element
		System.out.println(qq1);
		System.out.println(qq1.poll());  // remove first element
		System.out.println(qq1);
		//LinkedList queue 		FIFO 
		System.out.println("-------------------");
		Queue qq2 = new LinkedList();
		qq2.add(3);
		qq2.add(6);
		qq2.add(10);
		qq2.add(1);
		qq2.add(2);
		qq2.add(8);
		System.out.println(qq2);
		System.out.println(qq2.poll());
		System.out.println(qq2);
	}

}
