package com.niuniu.dlink;

public class Node {

	String date;
	/*
	 * 前驱
	 */
	 Node prev;
	/*
	 * 后继
	 */
	Node next;

	public Node() {

	}

	public Node(String e) {

		this.date = e;
	}

	@Override
	public String toString() {
		return "Node [date=" + date + "]";
	}
	
	
}
