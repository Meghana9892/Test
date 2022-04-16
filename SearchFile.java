package com.FileOperation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchFile extends WelcomeClass {

	public  void searchfile() {
		
		WelcomeClass welcomeclass= new WelcomeClass();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter directory or path");
		String path = sc.nextLine();
		File f = new File(path);
		if(f.isDirectory())
		{
			 System.out.println("Enter the File name with extension(if any) of Search ");
		      String filename = sc.nextLine();
		      File[] files = new File(path).listFiles();
		      List<String> listfiles = new ArrayList();
		     
		      for(File F:files)
		      {
		     	 listfiles.add(F.getName());
		      }
		      
		      boolean result=false;
		      
		      for(String s:listfiles )
		      {
		     	 if(s.contentEquals(filename))
		     	 {
		     		 result= true;
		     		 
		     	 }
		     	 
		      }
		      if(result==true)System.out.println("File Found in path "+path+"\\"+filename);
		      else System.out.println("File not Found");
		      
		}
		
		else
		{
			System.out.println("Entered Directory or path not found");
			welcomeclass.GoBack();
		}
		welcomeclass.GoBack();
	}
}
