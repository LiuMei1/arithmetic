package com.niuniu.dlink;

public class Test {

	public static void main(String[] args) {

		DLink list = new DLink();
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.size());
	}

}
