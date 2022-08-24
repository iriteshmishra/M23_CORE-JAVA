package com.cg.collection;

import java.util.ArrayDeque;


public class Example6 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayDeque a=new ArrayDeque();
		a.add(11);
		a.add("Ritesh");
		a.addFirst(0.5);
		a.addLast('r');
		System.out.println(a);

	}

}
