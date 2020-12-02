import java.io.File;
//import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;	//includes HashMap

public class HW4 {
	int x = 0;
	
	/* Going to for loop and create one for every file*/
	//Lists are variable size arrays
		//stores the list of word per file
	//List<String> list[x] = new ArrayList<String>();
	
	//Dictionaries are hash maps
		//stores each word and count the number of time they appear
	//HashMap<String, Integer> map[x] = new HashMap<>();
	
	
	//matrix[i][j]
		// i = list of all files
		// j = list of all the words that appears in that file
	

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		
		//total word count
		int totalwordcount = 0;
		
		//Path to all the files
		File path = new File("C:\\Users\\eddie\\OneDrive\\Desktop\\homework4\\data");
		
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
		
		//58 files and total word count for all files
		System.out.println("\n" + "Number of files: " + contents.length);
		System.out.println("Total word count: " + totalwordcount);
		
		//code later
		//test the code
	}
	
	
	//Word count
	//count the number of words of each file
	public static int wordcounter(String filename) throws IOException {
		int counter = 0;
		String line;
		
		//path to file
		String part = "C:\\Users\\eddie\\OneDrive\\Desktop\\homework4\\data\\";
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
	
	/*
	public static string tokenize() {
		//splits a given string into tokens around all non-alphabetical characters
		 	//break the speech into vocabulary words
		 	//separated by spaces
	}
	
	public static string normalize() {
		//puts all tokens in a given list in lower case and returns the list
		 	//fix words and make them lowercase
	}
	
	public static string getVocabulary() {
		//determines the list of distinct terms for a given list of term lists
	}
	
	public static string getInverseVocabulary() {
		//produces a mapping from index terms to indices in the vocabulary
	}
	
	public static string getTermFrequencies() {
		//determines the frequencies of all terms in a given term list
	}
	
	public static string getInverseDocumentFrequencies() {
		//determines the idf of all terms based on counts in given matrix
		 	//matrix[i][j]
		 	 	// i = list of words
		 	 	// j = amount appeared in file
	}
	
	public static string logTermFrequencies() {
		//turns given list of term freq. into log term freq. and returns it
	}
	
	public static string getTfldf() {
		//returns tf.idf weights for given document's term freq. and given idfs
	}
	
	public static string normalizeVector() {
		//normalizes a vector by dividing each element by the L2 norm
	}
	
	public static string dotProduct() {
		//returns the dot product of two input vectors
	}
	
	public static string runQuery() {
		//
	}
	 */

}
