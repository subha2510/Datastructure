package com.linkedlist;
import java.io.*;
import java.util.*;

class Node {
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class LinkedListUC1 {
    
	public static void main(String[] args) {
		
		System.out.println("Welcome To LinkedList Program");
		Node firstnode = new Node(56);
		Node secondnode = new Node(30);
		Node thirdnode = new Node(70);
		Node head = firstnode;
		firstnode.next = secondnode;
		secondnode.next = thirdnode;
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
		
	}
}
