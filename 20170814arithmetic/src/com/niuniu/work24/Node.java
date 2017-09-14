package com.niuniu.work24;


/**平衡二叉树的结点定义*/
class Node{
	int element;
	/**结点的平衡因子*/
	int balance = 0;	
	/**左子结点、右子结点、父节点*/
	Node left;
	Node right;
	Node parent;
	
	public Node(){}
	
	public Node(int element, Node parent){
		this.element = element;
		this.parent = parent;
	}
	
	public String toString(){
		return element + " BF=" + balance;
	}
	
}
