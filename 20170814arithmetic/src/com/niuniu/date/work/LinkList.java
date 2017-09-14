package com.niuniu.date.work;



public class LinkList {

	Node head;
	Node tail;
	
	int size;
	public LinkList() {
		size = 0;
		head = new Node();
		tail = new Node();
		//头没有前驱
		tail.prev =head;
		//尾没有后继
		head.next = tail;
	}
	
	public void add(String e) {
		Node node = new Node(e); 
		tail.prev.next = node;
		node.next = tail;
		tail.prev = node;
		size++;
	}

	/**
	 * 删除最后一个
	 * @return
	 */
	String remove(){
		
		Node s=tail.prev;
		tail.prev = s.prev;
		size--;
		return s.toString();
		
	}
	/**
	 * 删除指定位置index
	 * @param index
	 * @return
	 */
	String remove(int index){
		
		Node s = head;
		for (int i = 0; i <= index; i++) {
			s = head.next;
		}
		s.prev.next = s.next;
		s.next.prev = s.prev;
		size--;
		return s.toString();
	}

	public void clear() {
		
		head.next = tail;
		tail.prev = head;
		size = 0;
	}
}
