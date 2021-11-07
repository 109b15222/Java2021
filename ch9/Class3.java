class Caaa//(c)第十六行已經有一個了 所以不行
{
	private int value;//(d)不影響

	public Caaa()
	{
		value=10;
		System.out.println("value="+value);
	}
	public Caaa(int i)
	{
		value=i;
		System.out.println("value="+value);
	}
}
public class Class3 {
	public static void main(String[] args)
	{
		Caaa obj1=new Caaa();//(b)21 是沒有引數的建構元第五行 22是有一個引數的建構元第10行
		Caaa obj2=new Caaa(12);
	}

}
