// nested else if 
package Fundamentaljava;

import java.util.Scanner;
public class LessthanGreaterthanorEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a,b;
		a = s.nextInt();
		b = s.nextInt();
		
		if(a>b) {
		System.out.println("First is Greater");
		}
		else if(b>a) {
			System.out.println("Second is greater");
		}
			else {
				System.out.println("Both are Equal");
			}
		}
}
	//	if(a>b) {
	//		System.out.println("a is greater");
	//	}else {
	//		if(b>a) {
	//			System.out.println("b is greater");
	//		}
	//		else {
	//			System.out.println("Both are Equal");
	//		}
		
	

