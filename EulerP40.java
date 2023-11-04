package Euler;

//An irrational decimal fraction is created by concatenating the positive integers:
//
//0.12345678910<red>1</red>112131415161718192021...
//
//It can be seen that the 12^th digit of the fractional part is 1.
//
//If d_n represents the n^th digit of the fractional part, find the value of the following expression.
//
//d_1 x d_10 x d_100 x d_1000 x d_10000 x d_100000 x d_1000000

public class EulerP40 {

	public static void main(String[] args){
		long startTime		= System.currentTimeMillis();
		 
		EulerP40 problem	= new EulerP40();
		problem.solve();
		
		System.out.println("\nElapsed time: "+ (System.currentTimeMillis() - startTime) +" ms");	
		
	}
	
	
	public void solve(){
		
	}

}
