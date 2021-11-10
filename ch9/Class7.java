class power
{
	public static void math(int x,int n)
	{
		int a=1;
		for(int i=1;i<=n;i++)
			a*=x;
		System.out.println(x+"ªº"+n+"¦¸¤è"+a);
	}
}
public class Class7 {
	public static void main(String args[])
	{
		power.math(2,5);
		power.math(3,2);
	}

}
