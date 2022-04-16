package com.FileOperation;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class SortFile {
	
	public void sortFile() {
		
		WelcomeClass welcomeclass = new WelcomeClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Directory or Path to Sort");
		String path = sc.nextLine();
		File fpath = new File(path);
		if(fpath.isDirectory())
		{
		File files = new File(path+"\\");
		
		File[] file = new File(path+"\\").listFiles();
		
		
//path= path+"\\";
		
List<String> fileNames = new ArrayList();
for(File f: file)
{
	fileNames.add(f.getName());
}


System.out.println("List of Files in "+fpath);

for(String f: fileNames)
{
	System.out.println(f);
	
}
System.out.println("\n");
Collections.sort(fileNames);
System.out.println("List of File in "+fpath+" after Sorting in ascending order");
for(String f: fileNames)
{
	System.out.println(f);
	
}
welcomeclass.GoBack();
}


		else
		{
			System.out.println("Entered Directory or path not found");
			welcomeclass.GoBack();
		}
	
	}
}


