package First;

public class TenQuestion {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=5)
			{
				if(j==2)
				   break;
				   System.out.println(j);
				
				j++;
			}i++;
			System.out.println(i);
		}


	}

}
