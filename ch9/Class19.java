public class Class19 {
	public static void main(String args[])
	{
		(
			new CCircle(4.0)
			{
			void show()
			{
				System.out.println("­±¿n="+pi*radius*radius);
			}
			}
		).show();		
	}
			
	static class CCircle
	{
		public double pi=3.14;
		public double radius;
		
		public CCircle(double r)
		{
			radius=r;
		}
	}

}
