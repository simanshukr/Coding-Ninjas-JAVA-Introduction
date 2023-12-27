package Fundamentaljava;
import java.util.Scanner;
 
public class AveragebyInput {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	Scanner s = new Scanner(System.in);
	String str = s.next();
	
	int m1,m2,m3;
	Scanner i = new Scanner(System.in);
	m1= s.nextInt();
	m2= s.nextInt();
	m3= s.nextInt();
	int Avg = (m1+m2+m3)/3;
	System.out.println(str);
	System.out.println(Avg);

		
	}

}

