import java.util.Scanner;
class CCCC
{	
	public static void is_prime( int n)
	{
		int i,num=0;
		for(i=2;i<n; ++i) 
		{
			if(n%i==0)
			{
				++num;
			}
		}
		if(num==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}
	
}

public class Class02 {
	public static void main(String[] args)
	{
		int n;
		while(true){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		CCCC.is_prime(n);
		}
	}
}