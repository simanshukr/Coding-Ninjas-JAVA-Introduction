package Fundamentaljava;

import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//mine code
//		Scanner s = new Scanner(System.in);
	//	int a,c;
	//	a = s.nextInt();
	//	c=a%2;
	//	if (c==0) {
		//	System.out.println("a is even");
	//	}
	//	else {
	//		System.out.println("a is odd");
	//	}
		
		//teacher's code
		Scanner s = new Scanner(System.in);
		int a;
		a = s.nextInt();
		int rem = a%2;
		boolean result = rem==0;
		if (result==true) {
			System.out.println(a + " is even");
		}else {
			System.out.println(a + " is odd");
		}
	}

}
