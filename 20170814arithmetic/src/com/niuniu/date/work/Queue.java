package com.niuniu.date.work;

public class Queue {

	
	LinkList list = new LinkList();
	//dequeue
	//轮询
	/**
	 * 删除队列的第一个元素
	 * @return
	 */
	String poll(){
		return list.remove(0);	
	}
	
	/**
	 * 放入队列
	 * @param e
	 */
	void add(String e){
		list.add(e);
	}
	
	int size(){
		return list.size;
	}
	
	void clear(){
		list.clear();
	}
}
