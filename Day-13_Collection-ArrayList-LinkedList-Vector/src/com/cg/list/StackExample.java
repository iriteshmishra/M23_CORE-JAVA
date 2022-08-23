package com.cg.list;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack<Comparable> obj=new Stack<Comparable>();
		obj.add(0, 'R');
		obj.add(0, 'm');
		obj.add(0, 11.7f);
		System.out.print(obj);
		obj.push(34);
		System.out.print(obj);
		obj.pop();
		System.out.print(obj);

	}

}
