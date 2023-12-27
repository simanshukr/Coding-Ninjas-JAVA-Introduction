package Fundamentaljava;

import java.util.Scanner;

public class FactorsofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 2;
		while(i<=n/2) {
			int f = n%i;
				if(f==0) {
					System.out.print(i + " ");
					i=i+1;	
				}else {
					i=i+1;
				}   
		
	}

}
}