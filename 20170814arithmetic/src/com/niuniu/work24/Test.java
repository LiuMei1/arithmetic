package com.niuniu.work24;


public class Test {

	public static void main(String[] args) {
		// Integer[] num = {5,8,2,0,1, -2, -9, 100};
		// AVLTree<Integer> avl = new AVLTree<Integer>();
		// for(int i = 0; i < num.length; i++){
		// avl.insertElement(num[i]);
		// }
		// avl.nrInOrderTraverse();

		AVLTree avl = new AVLTree();

		avl.insertElement(9);
		avl.insertElement(7);
		avl.insertElement(13);
		avl.insertElement(6);
		avl.insertElement(8);
		avl.insertElement(5);
		
		avl.nrInOrderTraverse();
	}
}
