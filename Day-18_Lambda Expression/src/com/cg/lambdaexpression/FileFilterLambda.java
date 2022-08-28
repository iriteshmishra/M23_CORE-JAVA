package com.cg.lambdaexpression;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		FileFilter filter=(File pathname)->pathname.getName().endsWith(".jpg");
		File dir=new File("C:\\Users\\Ritesh Mishra\\OneDrive\\Pictures\\Camera Roll");
		File contents[]=dir.listFiles(filter);
		//enhanced for loop
		for(File i:contents)
		{
			System.out.println(i);
		}
	}

}