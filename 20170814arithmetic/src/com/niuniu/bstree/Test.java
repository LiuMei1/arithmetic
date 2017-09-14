package com.niuniu.bstree;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Book b1 = new Book();
		b1.ibsn = "1234";
		b1.title = "abc";
		b1.price = 7;
		Book b2 = new Book();
		b2.ibsn = "1235";
		b2.title="xyz";
		b2.price = 21;
		Book b3 = new Book();
		b3.title = "def";
		b3.price = 21;
		
//		TreeSet<Book> tree = new TreeSet
		TreeSet<Book> tree = new TreeSet<Book>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		
//		System.out.println(tree);
		
//		System.out.println(b1.compareTo(b2));
//		System.out.println(b1.compareTo(b3));
		
		BinarySearchTree tree1 = new BinarySearchTree();
		
		Node n1 =  tree1.add(7);
		Node n2 =  tree1.add(2);
		Node n3 =  tree1.add(9);
		Node n4 =  tree1.add(3);
		
		System.out.println(n1.data);
		System.out.println(n2.data);
		System.out.println(n3.data);
		System.out.println(n4.data);
		
		System.out.println(n1.left.data);
		System.out.println(n1.right.data);
		System.out.println(n1.left.right.data);
		
	}

}
