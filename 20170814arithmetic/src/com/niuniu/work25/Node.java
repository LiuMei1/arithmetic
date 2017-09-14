package com.niuniu.work25;

public class Node {

	int data;
	
	//高度，用于判断是否平衡
	int height;
	
	Node right;
	
	Node left;
	
	public Node() {

	}
	
	public Node(int data) {

		this.data = data;
		this.right = null;
		this.left = null;
	}
}
