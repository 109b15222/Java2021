class Caaa//(c)�ĤQ����w�g���@�ӤF �ҥH����
{
	private int value;//(d)���v�T

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
		Caaa obj1=new Caaa();//(b)21 �O�S���޼ƪ��غc���Ĥ��� 22�O���@�Ӥ޼ƪ��غc����10��
		Caaa obj2=new Caaa(12);
	}

}
