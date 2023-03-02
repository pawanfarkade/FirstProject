package First;

import java.util.*;

public class TrimorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int i = 1;
		int digit = 1;
		int cube = 1;
		int copy = num;
		while (i <= num) {
			cube = num * num * num;
			digit = cube % 10;
			num = num / 10;
		}  
		  if(num==digit) 
		  {
			  System.out.println("The number is trimorphic");
		  
		  }
		  else { System.out.println("Not");
		  }
		 
		
	}

}
