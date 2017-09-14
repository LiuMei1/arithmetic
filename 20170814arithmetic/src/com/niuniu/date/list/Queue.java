package com.niuniu.date.list;

//ADT(抽象数据类型)
public class Queue {

	//数据
	int[] data = new int[5];
	int head = 0;
	int end = 0;
	//en(1),en(2)
	//{1,2,0,0,0}
	//h=0 e=1
	
	//de()
	//h=1 e=2
	//{1,2,0,0,0}
	
	//en(99),en(199)
	//{1,2,99,199,0}
	//h=1 e=4
	//de(),de()
	//h=3,e=4
	//{1,2,99,199,0}
	
	//h=3 e=2
	//{101,102,99,199,100}
	//{0,0,0,0,0}
	
	
	
	//操作
	/**
	 * 放在队列的末尾
	 * @param e
	 */
	void enqueue(int e){
		
	}
	/**
	 * 从最前面取出一个元素
	 * @return
	 */
	int dequeue(){	
		return 0;
	}
	void empty(){
		
	}
}
