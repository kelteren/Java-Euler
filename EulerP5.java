package eulerComplete;
//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class EulerP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		
		EulerP5 problem	= new EulerP5();
		problem.solve(20);
		
		System.out.println("\nElapsed time: " + (System.currentTimeMillis() - startTime) + " ms");
	}
	
	
	public void solve(int limit){
		
		int num 	= 1;
		
		while(! haveNoRemainder(num, limit) ){
			num++;
		}
		
		System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to " +  limit + " is " + num );
	}
	
	/**
	 * 
	 * @param num dividend to be tested
	 * @param limit the largest divisor for the dividend to tested with  
	 * @return true if number is evenly divisible between 1 and limit
	 */
	public static boolean haveNoRemainder(int num, int limit){
		// TODO lag funksjonen ferdig
		for(int i = 1 ; i <= limit ; i++ ){
			if( (num % i) != 0){
				return false;
			}			
		}
		
		return true;
		
	}
}
