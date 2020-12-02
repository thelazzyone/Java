import java.io.File;
//import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//This code will read all csv files and print their name
public class ReadCSVs {
	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		
		//Path to all the files
		File path = new File("File path");
		
		//store the files in an string array
		String contents[] = path.list();
		//sort the list of files in contents
		Arrays.sort(contents);
		
		//print the list of files
		System.out.println("List of all files: ");
		for(int i = 0; i < contents.length; i++) {
			
			//print the current file name
			System.out.print(contents[i]);
			
		}
		
		//58 files
		System.out.println("\n" + "Number of files: " + contents.length);
		
	}
	
}
