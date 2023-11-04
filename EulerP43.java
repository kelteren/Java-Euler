package Euler;

//The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits 0 to 9 in some order, but it also has a rather interesting sub-string divisibility property.
//
//Let d_1 be the 1st digit, d_2 be the 2^nd digit, and so on. In this way, we note the following:
//
//d_2d_3d_4=406 is divisible by 2
//d_3d_4d_5=063 is divisible by 3
//d_4d_5d_6=635 is divisible by 5
//d5d6d7=357 is divisible by 7
//d6d7d8=572 is divisible by 11
//d7d8d9=728 is divisible by 13
//d8d9d10=289 is divisible by 17
//Find the sum of all 0 to 9 pandigital numbers with this property.

public class EulerP43 {

	public static void main(String[] args){
		long startTime		= System.currentTimeMillis();
		 
		EulerP43 problem	= new EulerP43();
		problem.solve();
		
		System.out.println("\nElapsed time: "+ (System.currentTimeMillis() - startTime) +" ms");	
		
	}
	
	
	public void solve(){
		
	}

}

