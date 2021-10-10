package CodePractice;

import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ModifySpreadSheet {
	
	//public static String StoreFileNames[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This program modify spread sheets.");
		
		AskUserForFilePath();
		//AskUserForFileName();

	}
	
	//ToDo:
	//ask user for the file path/location
	public static void AskUserForFilePath() {
		Scanner scanUserInput = new Scanner(System.in);
		
		System.out.println("Please type in the file path or location:");
		String UserInput = scanUserInput.next();
		scanUserInput.close();
		
		ReadAndStoreAllFilesName(UserInput);
	}
	
	//ToDo:
	//store all files name into array
	public static void ReadAndStoreAllFilesName(String FileLocation) {
		File filePath = new File(FileLocation);
		
		String StoreFileNames[] = filePath.list();
		AskUserForFileName(StoreFileNames);
	}
	
	//ToDo:
	//ask user for file name
	public static void AskUserForFileName(String ListofFiles[]) {
		Scanner scanUserInput = new Scanner(System.in);
		
		System.out.println("Please type in the spreadsheet file name:");
		String UserInput = scanUserInput.next();
		scanUserInput.close();
		
		SearchForFile(UserInput, ListofFiles);
	}
	
	
	//ToDo:
	//find the file
	public static void SearchForFile(String File2Search4, String ListOfFiles[]) {
		try {
			for(int numofFiles = 0; numofFiles < ListOfFiles.length; numofFiles++) {
				System.out.println("File Found.");
				System.out.println(ListOfFiles[numofFiles]);
			}
			
		} catch (Exception e) {
			//add counter
			
			System.out.println("Find not found. Try again.");
			AskUserForFileName(ListOfFiles);
		}
		
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
