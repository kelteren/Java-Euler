package Euler;

//The prime 41, can be written as the sum of six consecutive primes:
//
//41 = 2 + 3 + 5 + 7 + 11 + 13
//This is the longest sum of consecutive primes that adds to a prime below one-hundred.
//
//The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.
//
//Which prime, below one-million, can be written as the sum of the most consecutive primes?
		
public class EulerP50 {

	public static void main(String[] args){
		long startTime		= System.currentTimeMillis();
		 
		EulerP50 problem	= new EulerP50();
		problem.solve();
		
		System.out.println("\nElapsed time: "+ (System.currentTimeMillis() - startTime) +" ms");	
		
	}
	
	
	public void solve(){
		
	}

}
