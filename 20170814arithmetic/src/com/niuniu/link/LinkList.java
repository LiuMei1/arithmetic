package com.niuniu.link;

//ADT
public class LinkList {

	//数据
	int size = 0;
	//链表的头节点
	Node head;
	//链表中的当前节点
	Node current;
	
	public LinkList() {

		head = new Node(null,null);
		current = head;
	}
	
	//操作
	
	void add(String s){
		Node node = new Node(s, null);
		current.next = node;
		current = node;
		
		size++;
	}
	
	Node get(int index){
		if(index >= size){
			return null;
		}
		Node node = head;
		for (int i = 0; i <= index; i++) {
			node = node.next;
		}
		return node;
	}
	
	/**
	 * 在指定位置插入新元素
	 * @param s  元素的内容
	 * @param index  位置（索引）
	 */
	void add(String s,int index){
		Node node = new Node(s);
		Node prev = head;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		node.next  = prev.next;
		prev.next = node;
		size++;
	}
	
	Node remove(){
		Node node = current;
		current = get(size-2);
		size--;
		return node;
	}
	Node remove(int index){
		if(index<0||index>=size){
			return null;
		}
		if(index+1==size){
			remove();
		}
		Node prev = get(index-1);
		Node next = get(index+1);
		
		prev.next = next;
		size--;
		
		return get(index);	
	}
	
	int size(){
		return 0;
	}
	
	boolean isEmpty(){
		
		return size != 0;	
	}
	
	void clear(){
		size = 0;
	}
	
}
