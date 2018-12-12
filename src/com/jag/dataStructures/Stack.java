package com.jag.dataStructures;

public class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size){
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;    //represnt the index position of last item in stack
	}
	
	//push method to put the item in top of the stack
	public void push(char item){
		if(isFull()){
			System.out.println("Stack is full");
		} else {
			this.top++;
			this.stackArray[top] = item;

		}
		
	}
	
	
	//pop method to remove the item from the top
	public char pop(){
		if(isEmpty()){
			System.out.println("Stack is already empty");
			return '0';
		} else {
		int old_top = top;
		top--;
		return stackArray[old_top];
		}
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
