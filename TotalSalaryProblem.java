//Q Write a program to calculate the total salary of a person. 
//The user has to enter the basic salary (an integer) and the grade 
//(an uppercase character), and depending upon which the total salary is calculated as -
//   (totalSalary = basic + hra + da + allow – pf)
// hra   = 20% of basic
// da    = 50% of basic
// allow = 1700 if grade = ‘A’
// allow = 1500 if grade = ‘B’
// allow = 1300 if grade = ‘C' or any other character
// pf    = 11% of basic.
//String str = s.nextLine();
//		char ch = str.charAt(0);

package Fundamentaljava;

import java.util.Scanner;
import java.lang.Math;
public class TotalSalaryProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int basic,all ;
		basic = s.nextInt();
		String str = s.next();
		char grade = str.charAt(0);
		double hra = 0.20*basic;
		double da = 0.50*basic;
		double pf = 0.11*basic;
		if(grade ==65) {
			all = 1700;
			
		}else if(grade ==66) {
			all = 1500;
		
		}else{
			all = 1300;
		}
		double ts = (basic + hra + da + all)-(pf);
		double p=Math.round(ts);
		int h=(int)(p);
		System.out.println(h);
		// solved by me 
	}

}
