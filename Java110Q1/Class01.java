class AAAA
{	
	double pi=3.14159;
	
	void Cal_area(int radius)
	{
		System.out.println("�b�|="+radius);
		System.out.println("�y�����n="+((double)4/3)*pi*(radius*radius*radius));
	}
	void Cal_area(int lenght,int width,int high)
	{
		System.out.println("��="+lenght+",�e="+width+",��="+high);
		System.out.println("�ߤ�����n="+(lenght*width*2+width*high*2+lenght*high*2));
	}
}
public class Class01 {
	public static void main(String[] args)
	{
		AAAA aaaa=new AAAA();
		
		aaaa.Cal_area(10);
		
		aaaa.Cal_area(4,5,6);
	}

}
