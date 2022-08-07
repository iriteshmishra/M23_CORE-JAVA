package com.cg.oops;

class Pulser
{

	public int speed;
	public String color;
	//parameterized constructor
	
	////Non-Parameterized Constructor
	Pulser()
	{
		System.out.println("Welcome TO TechnoServe India");
	}
	//parameterized constructor
	Pulser(int sp,String col)
	{
		speed=sp;
		color=col;
	}
	
	void accept()
	{
		System.out.println("Speed is: "+speed+"km/hr" +" and color is: "+color);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Pulser p=new Pulser();
		Pulser p1=new Pulser(45,"Green");
		p1.accept();
		

	}

}