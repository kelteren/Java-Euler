package eulerComplete;
//A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
//
//a^2 + b^2 = c^2
//For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.


public class EulerP9 {
	
	public static void main(String[] args){
		long startTime	= System.currentTimeMillis(); 
		
		EulerP9	problem	= new EulerP9();
		problem.solve(1000);
		
		System.out.println("\nElapsed Time: " + (System.currentTimeMillis() - startTime) + " ms");
		
	}
	
	public void solve(int limit){
		
		int a	= 0;
		int b	= 0;
		int c	= 0;
		
	outerloop:	for( int x = 1 ; x < limit ; x++){
					for( int y = 1 ; y < limit ; y++){
						for( int z = 1 ; z < limit ; z++){
					
							if( (x + y + z  == 1000) && ((x*x + y*y) == z*z) ){
								a	= x;
								b	= y;
								c	= z;
				
								break outerloop;
						
							}		
						}
					}
				}
		
		System.out.println("a: " + a + ", b: " + b + ", c: " + c);

		System.out.println("Pythagorean triplet for which a + b + c = 1000, the product is " + (a*b*c));
		
	}
		
}
