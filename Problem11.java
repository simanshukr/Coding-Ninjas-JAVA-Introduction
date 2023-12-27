//Number of hellos
package Fundamentaljava;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
	    int y=5;
	    while((x=5)==y)
	    {
	        System.out.println("Hello");
	        x++;
	        y++;
	    }
	}

}
//he loop will run the first time as x=5 and y is also 5.  
//Both are equal so the loop will get executed and after printing 
//"Hello" x and y both will be incremented to 6. 
//Now, if we check the while condition x=5 (x is being assigned the value 5) 
//and y=6 (due to increment). So, x and y are not equal , 
//hence condition is false and the loop will not  get executed. 