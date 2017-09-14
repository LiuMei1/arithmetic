package com.niuniu.link;

/**
 * 链表中的一个节点
 * @author LiuMei
 *
 */
public class Node {

	/**
	 * 数据
	 */
	String date;
	
	/**
	 * 下一个节点
	 */
	Node next;

	public Node(String date, Node next) {
		super();
		this.date = date;
		this.next = next;
	}

	public Node(String s) {
		this.date = s;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Node [date=" + date + "]";
	}
	
	
	
	
}
