package com.niuniu.sort;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
//		int[] a = { 7, 3, 4, 2, 8, 5, 6, 1, 9};
//		 int[] a ={14,12,15,13,11,16};
		int[] a = {5,1,5,2,5,3,5,4,5,7,5,9,5};
		// bubbleSort(a);
		// selectionSort(a);
		// insertionSort(a);
		// quickSort(a);
//		quickSort2(a);
		mergeSort(a);
		// System.out.println("------------");
//		System.out.println(binarySear(a,9));
		System.out.println(Arrays.toString(a));

	}


	/**
	 * 归并排序
	 * @param a
	 */
	private static void mergeSort(int[] a) {
		mergeSort(a,0,a.length-1);	
	}

	private static void mergeSort(int[] a, int left, int right) {

		if(left >= right){
			return;
		}
		int mid = (left +right)/2;
		
		mergeSort(a, left,mid);
		mergeSort(a, mid+1, right);
		
		merge(a,left,mid,right);
	}

	private static void merge(int[] a, int left, int mid, int right) {

		int[] temp = new int[a.length];
		
		int lo1 = left;
		int lo2 = mid+1;
		int index = left;
		
		while(lo1<=mid && lo2<=right){
			if(a[lo1]<a[lo2]){
				temp[index++] = a[lo1++];
			}else{
				temp[index++] = a[lo2++];
			}
		}
		
		while(lo1<=mid){
			temp[index++] = a[lo1++];
		}
		
		while(lo2<=right){
			temp[index++] = a[lo2++];
		}
		
//		System.out.println(Arrays.toString(temp));
		
		while(left<=right){
			a[left] = temp[left];
			left++;
		}
	}

	/**
	 * 二分搜索
	 * 
	 * @param a
	 * @param i
	 * @return
	 */
	private static int binarySear(int[] a, int i) {

		quickSort(a);

		int hi = a.length - 1;
		int lo = 0;
		// for(;;){
		// int index = (hi+lo)/2;
		// if(a[index] == i){
		// return index;
		// }
		// if(hi==lo||lo==index){
		// if(a[hi]==i){
		// return hi;
		// }
		// break;
		// }
		// if(a[index]>i){
		// hi = index;
		// }else{
		// lo = index;
		// }
		//
		// }
		while (lo <= hi) {
			int index = (lo + hi) / 2;
			if (a[index] == i) {
				return index;
			} else if (a[index] > i) {
				hi = index - 1;
			} else {
				lo = index + 1;
			}
		}
		return -1;
	}

	/**
	 * 快速排序
	 */
	private static void quickSort(int[] a) {

		quickSort(a, 0, a.length - 1);
	}

	private static void quickSort(int[] a, int left, int right) {

		if (left < right) {
			int key = a[right];
			int lo = left, hi = right - 1;
			for (;;) {
				while (a[lo] <= key && hi >= lo) {
					lo++;
				}
				while (a[hi] >= key && hi > lo) {
					hi--;
				}
				if (lo < hi) {
					swap(hi, lo, a);
				} else {
					break;
				}
			}
			swap(right, lo, a);

			// System.out.println(Arrays.toString(a));
			quickSort(a, left, lo - 1);
			quickSort(a, lo + 1, right);
		} else {
			return;
		}

	}
	
	/**
	 * 快速排序2
	 * @param a
	 */
	private static void quickSort2(int[] a) {

		quickSort2(a, 0, a.length - 1);
	}

	private static void quickSort2(int[] a, int lo, int hi) {

		if(lo >= hi)
			return;
		
		int index = partition(a,lo,hi);
		
		quickSort2(a, lo, index-1);
		quickSort2(a, index+1, hi);
	}


	private static int partition(int[] a, int lo, int hi) {
		
		int key = a[hi];
		
		while(lo<hi){
			while(a[lo]<=key && hi>lo){lo++;}
			a[hi]= a[lo];
			while(a[hi]>=key && hi>lo){hi--;}
			a[lo]=a[hi];
		}
		a[hi]=key;

		return hi;
	}
	
	public static int partition2(int []array,int lo,int hi){
        //固定的切分方式
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){//从后半部分向前扫描
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){//从前半部分向后扫描
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        return hi;
    }


	/**
	 * 插入排序
	 * 
	 * @param a
	 */
	private static void insertionSort(int[] a) {

		int sum = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				sum++;
				if (a[j] < a[j - 1]) {
					swap(j, j - 1, a);
				} else {
					break;
				}
			}
		}
		System.out.println(sum);

	}

	/**
	 * 选择排序
	 * 
	 * @param a
	 */
	private static void selectionSort(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length - 1; i++) {
			int t = i;
			for (int j = i + 1; j < a.length; j++) {
				sum++;
				if (a[j] < a[t]) {
					t = j;
				}

			}
			swap(t, i, a);
		}
		System.out.println(sum);
	}

	/**
	 * 冒泡排序
	 * 
	 * @param a
	 */
	private static void bubbleSort(int[] a) {

		int sum = 0;
		// 轮
		for (int i = 0; i < a.length; i++) {
			// 具体操作
			for (int j = a.length - 1; j > i; j--) {
				sum++;
				if (a[j] < a[j - 1]) {
					swap(j, j - 1, a);
				}
			}
		}
		System.out.println(sum);
	}

	private static void swap(int j, int i, int[] a) {

		int x = a[i];
		a[i] = a[j];
		a[j] = x;
	}
}
