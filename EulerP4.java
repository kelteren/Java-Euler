package eulerComplete;

//A palindromic number reads the same both ways. The largest palindrome 
//made from the product of two 2-digit numbers is 9009 = 91 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.

/**
 * 
 * @author tk
 *
 */

public class EulerP4 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		EulerP4 problem	= new EulerP4();
		problem.solve(1000);
		
		System.out.println("\nElapsed time: " + (System.currentTimeMillis() - startTime) + " ms");
	}
	
	public void  solve(int max){	
		int palX		= 0;
		int palY		= 0;
		
		for (int x = 0 ; x < max ; x++){
			for(int y = 0 ; y < max ; y++){
				
				if( isPalindrome(x*y) && (x*y) > (palX * palY) ){
					palX		= x;
					palY		= y;
				}
			}
		}
		
		System.out.println("Largest palindrome is " + (palX * palY) + " and consists of " + palX + " and " + palY );
				
	}

	/**
	 * 
	 * @param num number to be tested if palindromic
	 * @return true if num is a palindrome, false if num is not a palindrome
	 */
	public static boolean isPalindrome(int num){
		
		int number		= num;
		int reversed	= 0;
		int LSD			= 0;
		
		while( number > 0){
			LSD			= number % 10;
			reversed	= reversed * 10 + LSD;
			number		/= 10;
		}
		
		if(reversed == num){
			return true;
		}else{
			return false;
		}		
	}
}
