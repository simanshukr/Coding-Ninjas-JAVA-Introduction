package Fundamentaljava;
import java.util.Scanner;
public class Avgbyinputwithname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m1,m2,m3;
		Scanner s=new Scanner(System.in);
		String str=s.next();
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();
		int avg=(m1+m2+m3)/3;
		System.out.println(str);
		System.out.print(avg);
	}

}
