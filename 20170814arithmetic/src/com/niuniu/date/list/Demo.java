package com.niuniu.date.list;

public class Demo {

	public static void main(String[] args) {
		
		//
		int[] a={0,31,28,31,30};
		//随机访问数组中的元素
		//c 常数
		String[] s = {"","","",""};
		//输入生日获得星座
		
		ListTable lt = new ListTable();
//		System.out.println(lt.getSize());
		lt.show();
		lt.add(200);
		lt.add(300);
		lt.add(99);
		
		lt.show();
//		System.out.println(lt.getSize());
		int e = lt.remove(1);
		lt.show();
		
		//清空
		lt.empty();
		lt.show();
		lt.add(1111);
		lt.show();
		lt.add(2000);
		lt.show();
		
		lt.add(999,3);
	}
}
