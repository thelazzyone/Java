package Programs;

import java.util.Scanner;

public class UserPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int status = 1;
		int num = 3;
		
		//For capturing the value of n
	  	Scanner scan = new Scanner(System.in);
	  	System.out.println("Enter the value of n:");
	  	n = scan.nextInt();
	  	
	  	if(n >= 1) {
	  		System.out.println("First "+n+" prime numbers are:");
	  		//2 is a prime number
	  		System.out.println(2);
	  	}
	  	
	  	//closing scanner after using
	  	scan.close();
	  	
	  	for(int i = 2; i <= n; ) {
	  		for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num % j == 0) {		//change status because number is not a prime
					status = 0;
					break;
				}
			}
			
			//if status is 1, then prime number
			if(status != 0) {
				System.out.println(num);
				i++;
			}
			
			//reset status and increment number
			status = 1;
			num++;
	  	}

	}

}
