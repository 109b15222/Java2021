class AAAA
{	
	double pi=3.14159;
	
	void Cal_area(int radius)
	{
		System.out.println("半徑="+radius);
		System.out.println("球型面積="+((double)4/3)*pi*(radius*radius*radius));
	}
	void Cal_area(int lenght,int width,int high)
	{
		System.out.println("長="+lenght+",寬="+width+",高="+high);
		System.out.println("立方體表面積="+(lenght*width*2+width*high*2+lenght*high*2));
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
