class CWin
{
	public static int cnt=0;//(f)類別變數
	private int height;
	private int width;
	private String color;
	public CWin(String str,int w,int h)
	{
		color=str;
		width=w;
		height=h;
		count();
	}
	public CWin()
	{
		this("Red",2,2);
	}
	public static void count()//都行
	{
		cnt++;
	}
	public static void setZero()
	{
		cnt=0;
	}
	public static void setvalue(int n)
	{
		cnt=n;
	}
	public static void show()
	{
		System.out.println("cnt="+cnt);
	}
}
public class Class8 {
	public static void main(String[] args)
	{
		CWin C1=new CWin();
		CWin C2=new CWin("WHITE",4,3);
		CWin.show();
		
		CWin.setZero();
		CWin.show();
		
		CWin.setvalue(4);
		CWin.show();
		
		CWin C3=new CWin("BLACK",4,4);
		CWin.show();
	}
}
