package com.cg.collection;

import java.util.ArrayDeque;

public class Example2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayDeque a=new ArrayDeque();
		a.add(11);
		a.add("Ritesh");
		System.out.println(a);
		a.addFirst(12);
		a.addLast("Mishra");
		System.out.println(a);

	}

}
