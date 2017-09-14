package com.niuniu.sort;

public class Test {

	public static void main(String[] args) {

		int[][] a = {{1,2},{1,9},{5,5},{13,5}};
//		System.out.println(a[0][0]);
//		System.out.println(a[0][1]);
//		System.out.println(maxLength(a));
		
		int n = 20;
//		step(n);
		System.out.println(step(n));
		System.out.println(step2(n));
		System.out.println(step3(n));
	}

	private static int step(int n) {
		
		int x = n/2;	
		int sum = 0;
		for (int i = 0; i <= x; i++) {
			int y = n - i;
			sum += c(y,i);
		}
		
		return sum;
	}
	
	private static double step2(int n)//要返回double类型，不然溢出   
	{  
	    if(n==1)  
	    {  
	        return 1.0;//return 1 不能这样写，溢出   
	    }  
	    else if(n==2)  
	    {  
	        return 2.0;//return 2 不能这样写，溢出   
	    }  
	    else  
	    {  
	        return step2(n-1)+step2(n-2);  
	    }  
	}   
	//for循环实现  
	private static int step3(int n)  
	{  
	    int n1 = 1;  
	    int n2 = 2;  
	    int n3 = 0; 
	    if(n==1||n==2){
	    	n3 = n;
	    }
	    for(int i=2;i<n;i++)  
	    {  
	        n3 = n1+n2;  
	        n1=n2;//向前移动,n1等于当前n2的值，   
	        n2=n3;//向前移动,n2等于当前n3的值，  
	    }  
	    return n3;  
	}   

	private static int c(int n, int i) {
		int x = 1;
		int y = 1;
		if(i == 0 || n == i){
			return 1;
		}
		for (int j = i; j >0 ; j--) {
			x *= n;
			n--;
		}
		for (int j = 2; j <= i; j++) {
			y *= j;
		}
//		System.out.println(x+"c======"+y);
		return x/y;
	}

	private static double maxLength(int[][] a) {
		int maxLength =0,length=0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				int x = a[i][0]-a[j][0];
				int y = a[i][1]-a[j][1];
				length = Length(x,y);
				if(length>maxLength){
					maxLength = length;
				}
			}
		}
		return Math.sqrt(maxLength);
	}

	private static int Length(int x, int y) {
		return x*x+y*y;
	}

}
