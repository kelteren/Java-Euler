package eulerComplete;
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?

public class EulerP7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime	= System.currentTimeMillis();

		EulerP7 problem	= new EulerP7();
//		problem.solve(6);
		problem.solve(10001);
		
		System.out.println("\nElapsed time: " + (System.currentTimeMillis() - startTime) + " ms");
	}
	
	public void solve(int limit){
		
		int counter		= 0;
		int prime		= 0;

		while(counter != limit){
			prime++;
			if(isPrime(prime)){
				counter++;
			}
		}
		
		System.out.println("Prime number number " + limit + " is " + prime);
		

	}

	public static boolean isPrime(int num){
		if ( num % 2 == 0){
			return false;
		}
		
	    for( int i = 3 ; i*i <= num ; i+=2) {
	        if( num % i == 0)
	            return false;
	    }
	    return true;
	}
}
