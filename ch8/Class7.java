class CTest
{
	void test(int n)
	{
		System.out.print("n="+n);
		
		if(n==0)
			System.out.println("���Ƭ��s");
		else if(n%2==1)
			System.out.println("���Ƭ��_��");
		else 
			System.out.println("���Ƭ�����");
	}
}
public class Class7 {
	public static void main(String args[])
	{
		CTest num=new CTest();
		
		num.test(3);
		num.test(8);
		num.test(0);
	}

}
