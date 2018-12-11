package com.jag.dataStructures;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size){
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;    //represnt the index position of last item in stack
	}
	
	//push method to put the item in top of the stack
	public void push(long item){
		this.top++;
		this.stackArray[top] = item;
	}
	
	
	//pop method to remove the item from the top
	public long pop(){
		int old_top = top;
		top--;
		return stackArray[old_top];
	}
	
	//peak to return the item in the top
	public long peak(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (maxSize-1 == top);
	}
	
}
