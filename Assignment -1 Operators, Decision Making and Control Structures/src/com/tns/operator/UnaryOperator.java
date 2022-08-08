package com.tns.operator;

public class UnaryOperator {

	public static void main(String[] args) {
		int a=5,b=3;
		int x=a++;//5
		int y=++b;//4
		int z=a+x;//6+5=11
		int k=a+y;
		System.out.println(z);//increment
		System.out.println(k);//decrement
	}

}
