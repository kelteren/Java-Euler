package eulerComplete;

//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//Find the sum of all the multiples of 3 or 5 below 1000.


public class EulerP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime		= System.currentTimeMillis();
		
		EulerP1 problem 	= new EulerP1();
		problem.solve(1000);
		
		System.out.println("Elapsed time: " + (System.currentTimeMillis() - startTime) + " ms");
		
	}
		
	public void solve(int limit){
		int sum = 0;
		
		/**
		 *  runs through all numbers up to limit, if divisible by 3 or 5 then add to the sum 
		 */
		for (int i = 0 ; i < limit ; i++){
			if( (i % 3) == 0 || (i % 5) == 0 ){
				sum += i;
			}
		}

		System.out.println("Sum of all multiples of 3 and 5, below " + limit + ", is " + sum);
		
	}

}
