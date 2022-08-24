package com.cg.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@SuppressWarnings("unused")
public class Example3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedHashSet s=new LinkedHashSet();
		s.add(11);
		s.add(null);
		s.add(11);
		System.out.println(s);


	}

}
