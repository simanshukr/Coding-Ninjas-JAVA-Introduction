package Fundamentaljava;

import java.util.Scanner;

public class CelciustoFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int S,E,W,fah;
		S = s.nextInt();
		E = s.nextInt();
		W = s.nextInt();
		
		while(S<=E) {
			fah=((5*(S-32))/9);
			System.out.println(S + "  " + fah);
			S+= W;
		}
	}

}
