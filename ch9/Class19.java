class Data
{
	private String name;
	private Test score;
	
	class Test
	{
		int english,math;
		public Test(int eng,int m)
		{
			english=eng;
			math=m;
		}
	public double avg()
	{
		return ((english+math)/2.0);
	}
	}
	public Data(String n,int e,int m)
	{
		name=n;
		score=new Test(e,m);
	}
	public void show()
	{
		System.out.println("name="+name);
		System.out.println("english="+score.english);
		System.out.println("math="+score.math);
		System.out.println("avg="+score.avg());
	}
}

public class Class19 {
	public static void main(String args[])
	{
		Data stu=new Data("Annie",85,92);
		stu.show();
	}

}
