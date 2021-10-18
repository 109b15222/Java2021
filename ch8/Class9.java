class CCalculator
{
	int a;
	int b;
	int c;
	
	void set_value(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}
	void show()
	{
		System.out.println("a="+a+", b="+b+", c="+c);
	}
	int add()
	{
		System.out.println(a+"+"+b+"+"+c+"=");
		return (a+b+c);
	}
	int sub()
	{
		System.out.println(a+"-"+b+"-"+c+"=");
		return(a-b-c);
	}
	int mul()
	{
		System.out.println(a+"*"+b+"*"+c+"=");
		return(a*b*c);
	}
	double avg()
	{
		System.out.println("a="+"b"+"c=");
		return ((a+b+c)/3);
	}
}
public class Class9 {
	public static void mian(String args[])
	{
		CCalculator obj=new CCalculator();
		
		obj.set_value(25,3,7);
		obj.show();
		System.out.println(obj.add());
		System.out.println(obj.sub());
		System.out.println(obj.mul());
		System.out.println("¥­§¡­È"+obj.avg());
		
	}
}
