package com.niuniu.bstree;

/**
 * 二分搜索树
 * @author LiuMei
 *
 */
public class BinarySearchTree {

	//数据
	Node root;
	
	public BinarySearchTree() {

		root = null;
	}
	
	public BinarySearchTree(int e) {
		root = new Node(e);
	}
	//操作
	public boolean isEmpty(){
		return root == null;
	}
	
	public void clear(){
		root = null;
	}
	public Node add(int e){
		return add(e,root);
	}
	public Node add(int e,Node node){
		if(root == null){
			root = new Node(e);
			return root;
		}
		Node n = null;
		if(node ==null){
			n = root = new Node(e);
		}else if(e<node.data){
			//左子树
			n = add(e,node.left);
		}else{
			//右子树
			n = add(e,node.right);
		}
		return n;
	}
	
	public Node remove(int e){
		return root;
		
	}
	
	public Node removeMin(Node n){
		return n;
	
		
	}
	
	public Node findMin(Node n){
		if(n==null)
		return null;
		while(n.left != null){
			
		}
		return n;
	}
	
	public Node max(){
		return root;
	}
}
