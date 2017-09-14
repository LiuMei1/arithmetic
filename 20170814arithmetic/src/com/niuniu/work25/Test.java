package com.niuniu.work25;

public class Test {

	public static void main(String[] args) {

		AVLTree avl = new AVLTree();

		// 右旋测试
//		avl.add(9);
//		avl.add(7);
//		avl.add(13);
//		avl.add(6);
//		avl.add(8);
//		avl.add(5);

		// 左旋测试
		// avl.add(9);
		// avl.add(7);
		// avl.add(13);
		// avl.add(10);
		// avl.add(14);
		// avl.add(15);
		
		//左右旋测试
//		avl.add(9);
//		avl.add(3);
//		avl.add(2);
//		avl.add(5);
//		avl.add(4);
//		avl.add(6);
//		avl.add(13);
		
		//右左旋测试
		avl.add(9);
		avl.add(5);
		avl.add(14);
		avl.add(12);
		avl.add(10);
		avl.add(13);
		avl.add(15);
		
		
		System.out.println("前：");
		System.out.print("    中序：    ");
		avl.inOrder(avl.root);
		System.out.print("    后序：    ");
		avl.postOrder(avl.root);
		System.out.println();

//		Node n = avl.rightRotate(avl.root);
//		 Node n = avl.leftRotate(avl.root);
//		Node n = avl.left_R_Rotate(avl.root);
//		Node n = avl.Right_L_Rotate(avl.root);
		
		Node p = new Node(14);
		Node s =avl.remove(p);
		Node n = avl.root;
		avl.print(s);
				
		System.out.println("后：");
		System.out.print("    中序：    ");
		avl.inOrder(n);
		System.out.print("    后序：    ");
		avl.postOrder(n);
		System.out.println();
	}

}
