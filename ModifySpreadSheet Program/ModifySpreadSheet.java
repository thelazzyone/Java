package CodePractice;

//Started Octorber 10 2021

/*
 * Changes Log:
 * -----------------------------
 * 10/21/2020 : Modifying AskUserForFilePath and ReadAndStoreAllFilesName
 * 				Then testing the rest of the code
 * 				Error at AskUserForFileName
 * 
 * 11/1/2021 : Fix AskUserForFileName
 * 				Move scanUserForInput out of function
 * 				Error in SearchAllFile
 * 					Not being able to compare desired file with files in the array
 *
 *
 */

//Test path:	D:\\ProgramTestFolder
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ModifySpreadSheet {
	
	//static List<String> StoreFileNames = new ArrayList<>();
	static int FileAttempt = 0;
	static Scanner scanUserInput = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This program modify spread sheets.");
		
		AskUserForFilePath();
		//AskUserForFileName();
		
		scanUserInput.close();

	}
	
	//ToDo:
	//ask user for the file path/location
	public static void AskUserForFilePath() {
		//Scanner scanUserInput = new Scanner(System.in);
		
		System.out.println("Please type in the file path or location:");
		String UserInput = scanUserInput.next();
		//scanUserInput.close();
		
		System.out.println("Path: " + UserInput + "\n");
		
		ReadAndStoreAllFilesName(UserInput);
	}
	
	//ToDo:
	//store all files name into array
	public static void ReadAndStoreAllFilesName(String FileLocation) {
		File filePath = new File(FileLocation);
		
		System.out.println("The List of Files: ");
		String StoreFileNames[] = filePath.list();
		for(int numberOfFiles = 0; numberOfFiles < StoreFileNames.length; numberOfFiles++) {
			System.out.println("\t" + StoreFileNames[numberOfFiles]);
		}
		
		AskUserForFileName(StoreFileNames);
	}
	
	//ToDo:
	//ask user for file name
	public static void AskUserForFileName(String ListofFiles[]) {
		System.out.println("Please type in the spreadsheet file name:");
		String UserInput = scanUserInput.next();
		
		//System.out.println("Input: " + UserInput);
		
		SearchForFile(UserInput, ListofFiles);
	}
	
	
	//ToDo:
	//find the file
	public static void SearchForFile(String File2Search4, String ListOfFiles[]) {
		System.out.println("This is what we are searching for: " + File2Search4 + "\n");
		
		try {
			for(int numofFiles = 0; numofFiles < ListOfFiles.length; numofFiles++) {
				String currentfilename = ListOfFiles[numofFiles];
				if(currentfilename == File2Search4) {
					System.out.println("File found.");
					System.out.println(ListOfFiles[numofFiles]);
					return;
					
				} else if(numofFiles >= ListOfFiles.length) {
					System.out.println("File not found, try a different file.");
					
				}
				
				//System.out.println("File Found.");
				//System.out.println(ListOfFiles[numofFiles]);
			}
			
		} catch (Exception e) {
			System.out.println("\n" + "Error was found while searching for files.");
			return;
		}
		
		//System.out.println("Something wrong");
		return;
	}
	
	//ToDo:
	//counter for amount fails to find file
	//ask for another file path/location
	
	
	//ToDo:
	//ask user for what he wants to do
	
	
	//ToDo:
	//create different ways to affect spreadsheet
		//display the number of columns and rows
		//print the spread sheet
		//put current spread sheet into a large spread sheet
		//etc....

}
