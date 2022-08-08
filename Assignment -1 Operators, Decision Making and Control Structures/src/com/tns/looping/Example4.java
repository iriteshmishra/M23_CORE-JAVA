package com.tns.looping;
//Enhanced For loop
public class Example4 {

	public static void main(String[] args) {
		int[] arr = {6, 2, 3, 5};
		int i = 0;
		for(int item : arr)
			System.out.println(item + " " + i++);

	}

}
