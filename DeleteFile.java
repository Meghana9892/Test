package com.FileOperation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.FileOperation.*;

public class DeleteFile extends WelcomeClass {

	public void deletefile() 
	{
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the path where you want to delete a file: ");  
	      String path = sc.nextLine(); 
	     
	      File fpath = new File(path);
	      if(fpath.isDirectory())
	      {
	      System.out.println("Enter the File to Delete with extension");
		String deleteFname = sc.nextLine();
		
		CaseSensitive caseSensitive = new CaseSensitive();
		boolean result;
		try {
			result = caseSensitive.Casecheck(deleteFname,path);
		
		path=path+"\\"+deleteFname;
			if(result)
			{
				File file = new File(path);
				file.delete();
				System.out.println("File deleted successfully");
				
			}
			else
			{
				System.out.println("File does not exist");
				
			}
			DeleteFile deleteFile = new DeleteFile();
			deleteFile.GoBack();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      }  
		else
		{
			System.out.println("Entered Path does not exist");

			DeleteFile deleteFile = new DeleteFile();
			deleteFile.GoBack();
		}
	      
		}
	     
		
}

