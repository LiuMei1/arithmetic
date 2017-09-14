package com.niuniu.dlink;

public class DLink {

	//约瑟夫环
	/**
	 * 头指针
	 */
	Node head;
	
	/**
	 * 尾指针
	 */
	Node tail;
	
	/**
	 * 大小
	 */
	int size;
	
	public DLink() {
		size = 0;
		head = new Node();
		tail = new Node();
		//头没有前驱
		tail.prev =head;
		//尾没有后继
		head.next = tail;
	}
	
	public void add(String e){
		Node node = new Node(e);
		tail.prev.next = node;
		node.next = tail;
		tail.prev = node;
		size++;
	}
	
	public Node get(int index){
		Node node = head;
		for(int i = 0;i<=index;i++){
			node = node.next;
		}
		return node;
	}
	boolean isEmpty(){
		
		return size==0;
	}

	public int size() {
		return size;
	}
}
