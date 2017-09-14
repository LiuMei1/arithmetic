package com.niuniu.sum;

public class Sum {

	public static void main(String[] args) {
		
		int[] a = {8,-2,3,7,-15,2,7,9,-12};
		int[][] b =  {{1,2},{3,3},{7,8},{12,1},{4,16}};
		maxLength(b);
		
		//8,-2 3 7 -15
		
		//8 -2 3  r9
		//8 l8 -2 r0     l8
		//3   r3
		
		//7 -15
		//r7
		
		//2 7 9 12
		
//		System.out.println(maxSum1(a));
		
//		System.out.println(maxSum2(a));
		
		System.out.println(fib(5));
		
	}

	private static int maxLength(int[][] b) {
		
		int maxLength = 0;
		for (int i = 0; i < b.length; i++) {
			int x1 = b[i][1];
			int y1 = b[i][2];
			int x2 = b[i+1][1];
			int y2 = b[i+1][2];
			Sum(x1-x2,y1-y2);
		}
		return 0;
		
	}

	private static int Sum(int i, int j) {

		return i^2+j^2;
	}

	/**
	 * 指数 O(2^n)
	 * @param i
	 * @return
	 */
	private static int fib(int i) {
		
		
		if(i<3){
			return 1;
		}
		return fib(i-1)+fib(i-2);
		
	}

	/**
	 * 复杂度n^2
	 * @param a
	 * @return
	 */
	private static int maxSum2(int[] a) {
		int sum = 0;
		int maxSum = 0;
		int start = 0;
		int end = 0 ;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if(sum>maxSum){
					maxSum = sum;
					start = i;
					end = j;
				}
			}
		}
		System.out.println(start + "-" + end);
		return maxSum;
	}

	
	/**
	 * 
	 * @param a
	 * @return
	 */
	private static int maxSum1(int[] a) {
		int sum = 0;
		int maxSum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if(sum>maxSum){
				maxSum = sum;
			}
			if(sum < 0){
				sum = 0;
			}
		}
		return maxSum;
	}
}
