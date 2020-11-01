package Programs;

public class NPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100;		//change number to print more than 100 prime number
		int status = 1;		//to check if 
		int num = 3;
		
		//
		System.out.println("Print " + n + " prime numbers: ");
		
		//print 2 because we skipped it
		System.out.println(2);
		
		for(int i = 2; i <= n; ) {	//start at 2 and goes to infinity
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
