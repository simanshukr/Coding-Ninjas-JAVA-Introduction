package Fundamentaljava;

import java.util.Scanner;

public class CheckingPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int div = 2;
		boolean isPrime = true;
		while(div <= n-1) {
			if(n%div==0) {
		//		System.out.println(n + " is Composite");
			isPrime = false;
			}
			div = div + 1;
		}
		if(isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("Composite");
		}
	}

}
