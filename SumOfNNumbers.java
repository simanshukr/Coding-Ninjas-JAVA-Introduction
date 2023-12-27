//Sum of N Numbers
package Fundamentaljava;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	
		int i,n,sum;
		n = s.nextInt();
		i=1; //next number to be added
		sum = 0;//initially sum is 0.
		while(i<=n) {
			sum = sum + i;
			i=i+1;
		}
		System.out.println(sum);
	}
	

}
