package Euler;

//The first two consecutive numbers to have two distinct prime factors are:
//
//14 = 2  7
//15 = 3  5
//
//The first three consecutive numbers to have three distinct prime factors are:
//
//644 = 2²  7  23
//645 = 3  5  43
//646 = 2  17  19.
//
//Find the first four consecutive integers to have four distinct prime factors. What is the first of these numbers?

public class EulerP47 {
	public static void main(String[] args){
		long startTime		= System.currentTimeMillis();
		 
		EulerP47 problem	= new EulerP47();
		problem.solve();
		
		System.out.println("\nElapsed time: "+ (System.currentTimeMillis() - startTime) +" ms");	
		
	}
	
	
	public void solve(){
		
	}

}
