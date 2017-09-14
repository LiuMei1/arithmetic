package com.niuniu.date.work;

public class Node {

	String data;
	
	Node prev;
	
	Node next;
	
	public Node() {

	}

	public Node(String e) {

		this.data = e;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}
