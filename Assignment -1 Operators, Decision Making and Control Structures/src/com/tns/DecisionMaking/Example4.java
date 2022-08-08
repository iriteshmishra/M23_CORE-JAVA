package com.tns.DecisionMaking;
//switch case(multibranching statements)e.g for this callertune press1 and so on.
import java.util.Scanner;


public class Example4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Ritesh");
			break;
		case 2:
			System.out.println("Hello");
			break;
		case 3:
			System.out.println("Vishal");
			break;	
		default:
			System.out.println("Invalid Input");
			s.close();
		}
		
		
	}

}
