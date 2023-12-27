package Fundamentaljava;

import java.util.Scanner;

public class PrintNnumbersusingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i=i+1;
		}
	}

}
