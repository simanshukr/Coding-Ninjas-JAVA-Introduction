package Fundamentaljava;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,pro;
		i=1;
		while(i<=10) {
			pro = n*i;
			System.out.println(pro);
			i=i+1;
		}
	}

}
