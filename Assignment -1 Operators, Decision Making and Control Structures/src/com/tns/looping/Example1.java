package com.tns.looping;
//for loop 
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+" ");
			s.close();
		}
//first initialization, then condition and if condition is true then print the 
// statement after that increment
	}

}
 