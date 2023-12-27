package Fundamentaljava;

import java.util.Scanner;

public class patternn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a =n;
		
		int i=1; //number of rows
		
		while(i<=a){
			
			
			char p = (char)('A'+a-1);
			int j = 1;
			while(j<=i) { // when 4x4 column j<=n,and when ascending column j<=i
				
				System.out.print(p);
				p = (char)(p+1);
				j=j+1;
			}
			
			System.out.println();
			a=a-1;
			i=i+1;			
			}
			
	}

	}

