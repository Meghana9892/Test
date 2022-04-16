package com.FileOperation;

import java.util.Scanner;
import com.FileOperation.*;




public class WelcomeClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WelcomeClass welcomeClass = new WelcomeClass();
		welcomeClass.Menu();
			
	}
	
	public void Menu()
	{
		WelcomeClass welcomeClass = new WelcomeClass();
		
		System.out.println("\t\t Welcome to Lockers Pvt. Ltd.");
		System.out.println("\t\t\tdelevoped by- Meghana\n");
		
		
		System.out.println("File Operations");
		System.out.println("1.Sort in Ascending order\n2. IO operation on Files: \n3. Close\n");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		
		boolean n= true;
		Selection: while(n)
			
		
		switch(userInput)
		{
		
		case 1: 
			SortFile sortfile = new SortFile();
			sortfile.sortFile();
			break;
		case 2:
				System.out.println("1.Add\n2.Delete\n3.Search\n4.Back to Main\n");
				int userChoice=sc.nextInt();
				switch(userChoice)
				{
				case 1:
					AddFile addfile = new AddFile();
						addfile.Addfile();
					break;
				case 2:
					DeleteFile deleteFile = new DeleteFile();
					deleteFile.deletefile();
					break;
				case 3:
					SearchFile searchfile = new SearchFile();
					searchfile.searchfile();
					break;
				case 4:
					welcomeClass.Menu();
					break;
					default:
						System.out.println("Invalid Input!");
						welcomeClass.Menu();
						break;
				}
				n=false;
				break;
			
		case 3: 
			System.exit(0);
			break;
		default:
				System.out.println("Invalid Input! please try again");
				userInput=sc.nextInt();
				continue Selection; 
		}
		n=false;
	}
	
	
	public void GoBack() 
	{
	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("GO TO HOME PAGE? (Y/N)\n");
		String userChoice = sc1.nextLine();
		WelcomeClass welcomeClass = new WelcomeClass();
		switch(userChoice)
		{
		case "Y": welcomeClass.Menu();
		break;
		case "N": System.exit(0);
		break;
		default:
			System.out.println("Invalid Input");
			welcomeClass.GoBack();
			break;
		}
	}
}


