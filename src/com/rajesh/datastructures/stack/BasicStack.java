/**
 * 
 */
package com.rajesh.datastructures.stack;


/**
 * @author RajeshAbhimanyu
 *Dec 20, 2017   9:25:52 AM
 *  www.rajeshabhimanyu.wordpress.com
 * git:rajeshjaava
 */
public class BasicStack<X> {
	private X data[];
	private int stackPointer;
	@SuppressWarnings("unchecked")
	public BasicStack() {
		data= (X[]) new Object[100] ;
		stackPointer=0;
	}
	public void push(X newItem) {
		data[stackPointer++]=newItem;
	}
	public X pop() {
		if(stackPointer==0) {
			throw new IllegalStateException("no more items in stack");
		}
		return data[--stackPointer];
	}
	public boolean contains(X item) {
	boolean found=true;
	for(int i=0;i<stackPointer;i++) {
		if(data[i].equals(item)) {
			found=true;
		}
		}
	return found;
	
	}
	
	public X access(X item) {
		while(stackPointer>0) {
			X tmpItem=pop();
			if(item.equals(tmpItem)) {
				return tmpItem;
			}
		}
		throw new IllegalArgumentException("count not found the item in stack "+item);
		
	}
	public int size() {
		return stackPointer;
	}

}
