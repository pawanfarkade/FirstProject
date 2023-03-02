package First;
import java.util.*;
public class FactorSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int fact=1;
		int ans=0;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			ans=ans+(i/fact);
		}
		System.out.println(ans);

	}

}
