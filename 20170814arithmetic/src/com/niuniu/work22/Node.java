package com.niuniu.work22;

public class Node {

	// 数据
	Object data;

	// 左子节点
	Node left;

	// 右子节点
	Node right;

	public Node(Object data) {
		this.data = data;
	}

	public Node() {
		
	}
	
    public void addChild(Node left,Node right){
		this.left = left;
		this.right = right;
	}

	public Object getData() {
		return data.toString();
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	
}
