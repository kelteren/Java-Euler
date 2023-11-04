package eulerComplete;

//In England the currency is made up of pound, �, and pence, p, and there are eight coins in general circulation:
//
//1p, 2p, 5p, 10p, 20p, 50p, �1 (100p) and �2 (200p).
//It is possible to make �2 in the following way:
//
//1�1 + 150p + 220p + 15p + 12p + 31p
//How many different ways can �2 be made using any number of coins?

/**
 * 
 * @author tk
 *
 */

public class EulerP31 {

	public static void main(String[] args) {

		long startTime	= System.currentTimeMillis();

		EulerP31 problem = new EulerP31();
		problem.solve();
				
		System.out.println("\nElapsed time: " + (System.currentTimeMillis() - startTime ) + " ms.");	
		
	}
	
	/**
	 * 
	 * @return returns the number of ways to count 2� 
	 */
	public void solve(){
		
		int a			= 200;
		int b			= 100;
		int c			= 50;
		int d			= 20;
		int e			= 10;
		int f			= 5;
		int g			= 2;
		int h 			= 1;

		int numOfComb	= 0;
		
		/**
		 * Brute-forcing, imagining that counting smalles denominations with outer loop is most effective.
		 * This can be done more effectively.
		 */
		for( int a_c = 0; a_c <= 1  ; a_c++){
			for( int b_c = 0; b_c <= 2 ; b_c++){
				for( int c_c = 0; c_c <= 4 ; c_c++){
					for( int d_c = 0; d_c <= 10 ; d_c++){
						for( int e_c = 0; e_c <= 20 ; e_c++){
							for( int f_c = 0; f_c <= 40 ; f_c++){
								for( int g_c = 0; g_c <= 100 ; g_c++){
									for( int h_c = 0; h_c <= 200 ; h_c++){
										
										if((a_c*a + b_c * b + c_c * c + d_c * d + e_c*e + f_c*f + g_c*g + h_c*h ) == 200){
//											System.out.println("found a combination: "+a_c +"x "+a+", "+ b_c +"x "+ b+", " + c_c +"x "+ c + ", " + d_c +"x "+ d +", " + e_c + "x " + e + ", " + f_c+"x " + f + ", " + g_c+"x " + g + ", " + h_c+"x " + h + ".");
											numOfComb++;
										}
										
									}
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println("There are " + numOfComb + " ways to get 2 pounds.");
//		return numOfComb;
	}
		
}

