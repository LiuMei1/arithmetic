package com.niuniu.work22;

public class BinaryTree {

	Node root;

	public BinaryTree() {

		root = new Node();
	}

	void init() {
		Node a = new Node("A");
		root = a;
		Node b = new Node("B");
		Node c = new Node("C");
		Node d = new Node("D");
		Node e = new Node("E");
		Node f = new Node("F");
		Node g = new Node("G");
		Node h = new Node("H");
		a.addChild(b, c);
		b.addChild(d, e);
		c.addChild(f, g);
		d.addChild(h, null);
	}

	public void print(Node n) {
		System.out.print(n.getData()+"-");
	}

	/**
	 * 前序遍历
	 * 
	 * @param p
	 */
	void preorder(Node p) {
		if (p != null) {
			print(p);
			preorder(p.getLeft());
			preorder(p.getRight());
		}
	}

	/**
	 * 中序遍历
	 * 
	 * @param p
	 */
	void inorder(Node p) {
		if (p != null) {
			inorder(p.getLeft());
			print(p);
			inorder(p.getRight());
		}
	}

	/**
	 * 后序遍历
	 * 
	 * @param p
	 */
	void postorder(Node p) {
		if (p != null) {
			postorder(p.getLeft());
			postorder(p.getRight());
			print(p);
		}
	}
}
