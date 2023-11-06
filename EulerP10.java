package eulerComplete;
// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
// Find the sum of all the primes below two million.

public class EulerP10 {

	public static void main(String[] args) {
		
		long startTime	= System.currentTimeMillis();
		
		EulerP10 problem	= new EulerP10();
		problem.solve();
		
		System.out.println("\nElapsed time: " + (System.currentTimeMillis() - startTime ) + " ms");
	}
	
	public void solve(){
		
		int limit		= 2000000;
		int counter		= 2;
		long sum		= 2;
		
		
		/**
		 * loops through all numbers up to limit and checks if prime
		 * if number is a prime, then add to the sum 
		 */
		while(counter < limit){
			
			if (isPrime(counter)){
				sum += counter;
			}
			
			counter++;
		}
		
		System.out.println("Sum of all primes below " + limit + " is " + sum);
		
	}

	/**
	 * 
	 * @param num The number to be checked if is a prime
	 * @return True if num is a prime, false if not
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
	    
	    return true;	}

}
