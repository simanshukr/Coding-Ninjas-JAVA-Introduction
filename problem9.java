package Fundamentaljava;

public class problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 50, b = 20;
		if(a>b) {
			if(a>100)
				System.out.println("Ace");
			if(b<100)
				b=50;
			}
		else if(a==b){
			System.out.println("King");
		}else {
			System.out.println("Queen");
		}
	}
	

}
//sol:(a>b) is true,So we go inside the if.
//(a>100) is false.
//(b<100) is true,so it is executed and b is updated to 50.

///But no print statement is executed hence no output.