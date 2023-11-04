package eulerComplete;

// The number, 197, is called a circular prime because all rotations of the 
// digits: 197, 971, and 719, are themselves prime.
//
// There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
//
// How many circular primes are there below one million?

public class EulerP35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime	= System.currentTimeMillis();

		EulerP35 problem	= new EulerP35();
//		problem.solve(100);
		problem.solve(1000000);
		
		System.out.println("\nElapsed time: "+ (System.currentTimeMillis() - startTime) +" ms");
	}

	public void solve(int limit){
		int count	= 0;

		/**
		 * Loops through all numbers up to limit, and checks whether it is a circular prime.
		 * If it is a circular prime, the counter will be incremented.
		 */
		for(int i = 0 ; i < limit ; i++){
			if( isCircPrime(i) ){
				count++;
			}
		}
		
		System.out.println("Number of circular primes below " + limit + ": " + count);
	}

	/**
	 * 
	 * @param num number to be tested if prime
	 * @return true if num is prime, false if not
	 */
	public static boolean isPrime(long num){
		
		if(num == 2){
			return true;
		}

		if(num < 2 || num % 2 == 0){
			return false;
		}
		
	    for( int i = 3 ; i*i <= num ; i+=2) {
	        if( num % i == 0)
	            return false;
	    }
	    
	    return true;
	}

	/**
 	* 
 	* @param num number to be tested if prime
 	* @return true if num is prime, false if not
 	*/
	public static boolean isPrime(int num){
		
		if(num == 2){
			return true;
		}

		if(num < 2 || num % 2 == 0){
			return false;
		}
		
	    for( int i = 3 ; i*i <= num ; i+=2) {
	        if( num % i == 0)
	            return false;
	    }
	    
	    return true;
	}

	/**
	 * 
	 * @param num number to be tested if is a circular prime
	 * @return true if num is a circular prime, false if not
	 */
	public static boolean isCircPrime(long num){
//		TODO fix this function

		int length	= numDigits(num);
		
		for( int i = 0 ; i <= length ; i++){
			if(isPrime(num)){

				long LSD		= num % 10;
				num	/= 10;
				num += (long)(LSD * Math.pow(10, length-1 ));

			}else{
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @param num number to be rotated
	 * @return the number rotated by one
	 */
	public static long rotateNumber(long num){
		
		int length	= numDigits(num);
		long LSD		= num % 10;

		num	/= 10;
		num += (long)(LSD * Math.pow(10, length-1 ));

		return num;
	}

	/**
	 * 
	 * @param num The number to have its digits counted.
	 * @return The number of digits in num, not counting leading zeroes 
	 */
	public static int numDigits(long num){

		int count = 0;

		/**
		 * counts how many times the number is divisible by 10
		 */
		while (num > 0 ){
			count++;
			num = num / 10;
		}
		return count;
	}

}
