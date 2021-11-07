class CRectangle
{
	int width;
	int height;
public CRectangle(int w,int h)
{
	width=w;
	height=h;
}
public CRectangle()
{
	width=10;//(c)this(10,8);
	height=8;
}
void show() 
{
	System.out.println("width="+width+"\nheight="+height);
}
}
public class Class1 {
	public static void main(String args[])
	{
		CRectangle a1=new CRectangle(4,4);
		a1.show();
		CRectangle a2=new CRectangle();
		a2.show();	
	}
}
