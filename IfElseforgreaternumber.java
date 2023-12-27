package Fundamentaljava;

import java.util.Scanner;

public class IfElseforgreaternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a, b;
		a= s.nextInt();
		b= s.nextInt();
		if (a>0 && b>0){
			System.out.println("Both are Positive");
		}else {
			System.out.println("Both are Not Positive");
		}
	}

}
