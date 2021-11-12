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
	public void setND(int num,int den)
	{
		n=num;
		d=den;
	}
}
public class Class10b {

	public static void main(String[] args)
	{
		CRational C1=new CRational();
		C1.setN(2);
		C1.setD(5);
		Class10b.show(C1);
		CRational C2=new CRational();
		C2.setND(4,4);
		Class10b.show(C2);
	}
	public static void show(CRational C)
	{
		System.out.println(C.n+"/"+C.d);
	}
}

