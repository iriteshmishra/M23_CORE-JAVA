package com.cg.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class Example7 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedHashSet s=new LinkedHashSet();
		s.add(11);
		s.add(12);
		s.add(22);
		s.add(52);
		System.out.println(s);

	}

}
