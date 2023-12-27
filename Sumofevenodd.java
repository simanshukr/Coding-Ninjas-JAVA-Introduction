//Write a program to input an integer N and print the sum 
//of all its even digits and sum of all its odd digits separately.
//Digits mean numbers, not the places! That is, if the given integer 
//is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.

package Fundamentaljava;

import java.util.Scanner;

public class Sumofevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a;
		int even = 0;
		int odd = 0;
		while(n>0) {
			a = n%10;
			n=n/10;
			
			if(a%2!=0) {
				odd = odd + a;
			}else {
				even = even + a;
			}
		}
		
		System.out.println(even+" "
				+ ""+odd);
		
	}

}
