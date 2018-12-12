package com.jag.dataStructures;

public class App {

	public static void main(String[] args) {
		Stack theStack = new Stack(10);
	
		System.out.println(reverseString("jagad"));
		
	}
	
	public static String reverseString(String str){
		Stack charStack = new Stack(str.length());
		for(int i=0; i<str.length(); i++){
			charStack.push(str.charAt(i));
		}
		String revString= "";
		while(!charStack.isEmpty()){
			char value = charStack.pop();
			revString = revString+value;
		}
		return revString;
	}
	
}
