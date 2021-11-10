class add
{
	public static void add2n(int n)
	{
		int a=0;
		for(int i=1;i<=n;i++)
			a+=i;
		System.out.println(a);		
	}
}
public class Class6 {
	public static void main(String args[])
	{
		add.add2n(5);
		add.add2n(10);
	}
}
