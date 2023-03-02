package First;
import java.util.*;
public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int i=0;
		int sum=0;
		int product=1;
		int digit;
		while(0<num) 
		{
			digit=num%10;
			sum=sum+digit;
			product=product*digit;
			
			num=num/10;
		}
		
		if (sum==product) 
		{
			System.out.println("The number is spy number");
			}
		else 
		{
			System.out.println("The nuber is not spy number");
		}
	}

}
