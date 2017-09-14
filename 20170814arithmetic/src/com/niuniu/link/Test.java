package com.niuniu.link;

public class Test {

	public static void main(String[] args) {

		LinkList link = new LinkList();
		link.add("a");
		link.add("b");
		link.add("c");
		link.add("d");
		
		link.add("z", 2);
		
		link.remove(1);
		link.remove(1);
		
		System.out.println(link.get(0));
		System.out.println(link.get(1));
		System.out.println(link.get(2));
		System.out.println(link.get(3));
		System.out.println(link.get(4));
		System.out.println(link.size);
	}

}
