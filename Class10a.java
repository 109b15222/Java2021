class CRational
{
	public int n;
	public int d;
	public void setN(int num)
	{
		n=num;
	}
	public void setD(int num)
	{
		d=num;
	}
	public void show()
	{
		System.out.println(n+"/"+d);
	}
	public void setND(int num,int den)
	{
		n=num;
		d=den;
	}
}
public class Class10a {
	public static void main(String[] args)
	{
		CRational C1=new CRational();
		C1.setN(2);
		C1.setD(5);
		C1.show();
		CRational C2=new CRational();
		C2.setND(4,4);
		C2.show();
	}
}
