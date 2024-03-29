package Euler;

//It was proposed by Christian Goldbach that every odd composite number can be written as the sum of a prime and twice a square.
//
//9 = 7 + 2x1^2
//15 = 7 + 2x2^2
//21 = 3 + 2x3^2
//25 = 7 + 2x3^2
//27 = 19 + 2x2^2
//33 = 31 + 2x1^2
//
//It turns out that the conjecture was false.
//
//What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?

public class EulerP46 {
	
	public static void main(String[] args){
		long startTime		= System.currentTimeMillis();
		 
		EulerP46 problem	= new EulerP46();
		problem.solve();
		
		System.out.println("\nElapsed time: "+ (System.currentTimeMillis() - startTime) +" ms");
	}
	
	
	public void solve(){
		
	}

}
