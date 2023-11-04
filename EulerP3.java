package eulerComplete;

/**
 * 
 * @author Thomas Karlsen
 *
 */

//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

public class EulerP3 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		EulerP3	problem	= new	EulerP3();

//		problem.solve(13195L);
//		problem.solve(602851475143L);
		problem.solve(600851475143L);

		System.out.println("\nElapsed time: " + (System.currentTimeMillis() - startTime) + " ms");
		
	}
	
	/**
	 * 
	 * @param number number to find the larges prime factor of
	 */
	public void solve(long number){

		long remember	= number;
		int i			= 2;
		
		while( i < number ){

			if( number % i == 0 && isPrime(i) ){
				number /= i;
			}
			
			i++;
		}
		
		System.out.println("Largest prime of " + remember + " is " + number);
	}
	
	/**
	 * 
	 * @param num number to be tested if prime, will also evaluate the number 2
	 * @return true if num is a prime, false if not a prime
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
}
