package com.niuniu.work22;

public class Demo {

	public static void main(String[] args) {

		BinaryTree b = new BinaryTree();
		b.init();
		System.out.println("前序：");
		b.preorder(b.root);
		System.out.println();
		System.out.println("中序：");
		b.inorder(b.root);
		System.out.println();
		System.out.println("后序：");
		b.postorder(b.root);
		System.out.println();
	}

}
