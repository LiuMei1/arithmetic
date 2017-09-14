package com.niuniu.date.list;

import java.security.InvalidParameterException;
import java.util.Arrays;

//动态数组
public class ListTable {

	int[] dataElement;
	int size = 0;

	public ListTable() {

		dataElement = new int[5];
	}

	public void add(int i) {

		if (dataElement.length == size) {
			// 扩容
			int[] n = new int[size * 2];
			for (int j = 0; j < size; j++) {
				n[j] = dataElement[j];
			}
		}
		dataElement[size++] = i;
	}

	/**
	 *线性表 插入、删除 O(n),随机访问 常数
	 * @param e
	 * @param index
	 */
	public void add(int e, int index) {

		if(index >= size){
			throw new InvalidParameterException();
		}
		for (int i = size-1; i >= index; i--) {
			dataElement[i+1] = dataElement[i];
		}
		dataElement[index]=e;
		size++;
	}

	public int getSize() {
		return size;
	}

	public int remove(int i) {

		if (i >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if (i < 0) {
			// 无效参数异常
			throw new InvalidParameterException();
		}
		int e = dataElement[i];
		for (int j = i + 1; j < size; j++) {
			dataElement[j - 1] = dataElement[j];
		}
		size--;

		return 0;
	}

	public void show() {

		System.out.println(Arrays.toString(dataElement));

	}

	public void empty() {
		size = 0;
	}

}
