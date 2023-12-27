package Fundamentaljava;

import java.util.Scanner;


public class ConditionalIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		Scanner s = new Scanner(System.in);
		a= s.nextInt();
		b= s.nextInt();
		 if(a>b){
			 System.out.println("a is greater");
		 }
		 else {
		 System.out.println("b is greater");
		 }
		System.out.println("if else is working");
		
	}

}
