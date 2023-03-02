package First;

public class FirstQuestion {
	/*
	 * Write a program to print all numbers between 1 and 100 except the numbers
	 * which are divisible by 5or 10
	 */

	public static void main(String[] args) {
		int n=100;
		
		for (int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0 ) 
			{
				
			}else {
				System.out.println(i);
			}
			
		}
		

	}

}
