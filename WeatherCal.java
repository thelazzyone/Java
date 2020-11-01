package Lab_2;

import java.util.Scanner;

public class WeatherCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double num = 0;
		
		
		System.out.println("This is a weather forecast calculater from  Fahrenheit to Celsius and back.");
        System.out.println("Enter any number: ");        
        
        //read user input and catch if the input is an integer
        try {
        	//
        	String input = scan.next();
        	num = Integer.parseInt(input);		//convert user input to int
        	
        } catch (Exception e) {
        	//use did not enter a intger
        	System.out.println("This is not a valid number.");
        }

        
        System.out.println("F to convert to Fahrenheit or C to convert to Celsius:");
        char choice = scan.next().charAt(0);
        
        scan.close();
        
        Double output;
        System.out.println(num);
        
        switch(choice) {
	        case 'F':
	        	output = (num * (9.0 / 5.0)) + 32.0;
	        	System.out.println("From " + num + " Celsius to " + output + " Fahrenheit.");
	        	break;
	        
	        case 'C':
	        	output = (num - 32.0) * (5.0 / 9.0);
	        	System.out.println("From " + num + " Fahrenheit to " + output + " Celsius.");
	        	break;
	        
	        default:
	        	System.out.printf("You have entered wrong choice");
                return;
        }
        
        System.out.println("Weather calculated.");

	}

}
