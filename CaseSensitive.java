package com.FileOperation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CaseSensitive {
									
	public boolean Casecheck(String userfilename,String path)
	{
		String userFileName = userfilename;
		String filePath = path;
		
		filePath = filePath+"\\";
		
		
		List<String> fileNames = new ArrayList<String>();
		
		File[] files = new File(filePath).listFiles();
		
		for(File f : files)
		{
			
				fileNames.add(f.getName());
		    
		}
		
		boolean result=false;
		for(String f : fileNames)
		{
			if(f.contentEquals(userFileName))
			{
				return true;
			}
			
	}
		
		return false;
}
	
}	
		

