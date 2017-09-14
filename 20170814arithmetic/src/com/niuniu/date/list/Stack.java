package com.niuniu.date.list;

public class Stack {

	// 数组
	// 链表
	String[] data;
	int top = -1;

	
	//{0,0,0,0,0}
	//push(a) push(b)
	//{a,b,0,0,0}
	//pop()
	//{a,b,0,0,0}
	//empty()
	//
	//先进后出
	public Stack() {
		data = new String[5];
	}
	
	//empty
	//逆波兰表达式
	//123006
	//

	/**
	 * 入栈
	 * @param e
	 */
	public void push(String e) {

		if(top+1==data.length){
			//
		}
		data[++top] = e;
	}

	/**
	 * 出栈
	 */
	public String pop() {
		return null;

	}

	public boolean isEmpty() {
		return false;

	}

	public void empty() {

		top = -1;
	}

}
