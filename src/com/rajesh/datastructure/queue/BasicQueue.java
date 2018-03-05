/**
 * 
 */
package com.rajesh.datastructure.queue;


/**
 * @author RajeshAbhimanyu
 *Dec 20, 2017   11:52:56 AM
 *  www.rajeshabhimanyu.wordpress.com
 * git:rajeshjaava
 */
public class BasicQueue <X>{
	private X[] data;
	private int front;
	private int end;
	
	public BasicQueue() {
		this(1000);
	}
	@SuppressWarnings("unchecked")
	public BasicQueue(int size) {
		data=(X[]) new Object[size];
		this.front=-1;
		this.end=-1;
	}
	public int size() {
		if(front==-1 && end==-1) {
			return 0;
		}
		else {
			return end - front +1;
		}
	}
public void enQueue(X item) {
	//first see if the queue is full
	if((end+1) % data.length == front) {
		throw new IllegalStateException("The queue is full");
		
	}
	else if(size()==0) {
		front ++;
		end++;
		data[end]=item;
	}
	else {
		end++;
		data[end]=item;
	}
	
}
public X deQueue() 
X item=null;
//if queue is empty we cont de queue anything
{
	if(size()==0) {
		throw new IllegalStateException(" the queue is empty");
		
	}
}
}
