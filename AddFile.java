package com.FileOperation;	

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import com.FileOperation.WelcomeClass;

public class AddFile extends WelcomeClass {
	
	
	
	public void Addfile() 
	{
		WelcomeClass welcomeClass = new WelcomeClass();
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the path where you want to create a file: ");  
	      String path = sc.nextLine(); 
	     File fpath = new File(path);
	     if(fpath.isDirectory())
	     {
		System.out.println("Enter the File name\n");
		String fileName = sc.nextLine();
		
		System.out.println("Select File Type");
		boolean n= true;
		Filetype: while(n)
		{
		System.out.println("1. Text\n2. Word Document\n3. PowerPoint\n");
		int type = sc.nextInt();
		String fileType;
		
		switch(type)
		{
		case 1: fileType = ".txt";
		break;
		case 2: fileType = ".docx";
		break;
		case 3: fileType = ".pptx";
		break;
		default:
			System.out.println("Incorrect Option choosen\n Please Try again");
			continue Filetype;
			
			
		
			
		}
		n=false;	
		try
		{
			path=path+"\\"+fileName+fileType;
			
	File file = new File(path);
	if(file.exists())
	{
		System.out.println("File Already exists");
		//BACK
	}
	else
	
	{
	boolean result;
	 
	result=file.createNewFile();
	if(result)
		
	{
		System.out.println("File Created Successfully");
}
	else
	{
		System.out.println("Error");
	}
	}
	}
		
	catch(IOException e)
	{
		e.printStackTrace();
	}
		
		}
	
		welcomeClass.GoBack();
	     }
	     else
	     {
	    	 System.out.println("Invalid Input!");
	    	 welcomeClass.GoBack();
	    	 
	     }
	}
}
	
