package com.niuniu.date.work;

/**
 * 栈
 * @author LiuMei
 *
 */
public class Stack {

	//数组
	LinkList list = new LinkList();
	
	int size;
	
	void push(String e){
		list.add(e);
	}
	
	String pop(){
		return list.remove();	
	}
	int size(){
		return list.size;
	}
	void clear(){
		
	}
}
