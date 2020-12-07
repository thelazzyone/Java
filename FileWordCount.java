import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//Counts all the words in each file

public class FileWordCount {
	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		
		//total word count
		int totalwordcount = 0;
		
		//Path to all the files
		File path = new File("File path");
		
		//store the files in an string array
		String contents[] = path.list();
		//sort the list of files in contents
		Arrays.sort(contents);
		
		//print the list of files
		System.out.println("List of all files: ");
		for(int i = 0; i < contents.length; i++) {
			//get word count per file
			int wordcount = wordcounter(contents[i]);
			
			//display file name
			System.out.print(contents[i]);
			
			//display word count of the file
			System.out.println("\t\t" + "Word count: " + wordcount);
			
			//adding to total count
			totalwordcount = totalwordcount + wordcount;
			
			//br.close();
		}

		//Print the total amount of files and total word count
		System.out.println("\n" + "Number of files: " + contents.length);
		System.out.println("Total word count: " + totalwordcount);
		
	}
	
	
	//Word count
	//count the number of words of each file
	public static int wordcounter(String filename) throws IOException {
		int counter = 0;
		String line;
		
		//path to file
		String part = "File path";
		String filepath = part + filename;
		
		//setting up to read the file
		FileReader file = new FileReader(filepath);
		BufferedReader br = new BufferedReader(file);
		
		//Read line by line  
		while((line = br.readLine()) != null) {  
		    //Splits each line into words  
		    String words[] = line.split(" ");  

		    //Counts each word  
		    counter = counter + words.length;  
		}  

			br.close();
			return counter;
	}

}
