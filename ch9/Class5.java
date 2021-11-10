class CCount//(d)cnt類別變數 (e)都可
{
	 private static int cnt=0;
	 public CCount()
	 {
		 count();
	 }
	 public static void count()
	 {
		 cnt++;
	 }
	 public static void setZero()
	 {
		 cnt=0;
	 }
	 public static void setValue(int n)
	 {
		 cnt=n;
	 }
	 public static void show() 
	 {
		 System.out.println("cnt="+cnt);
	 }
}
public class Class5 {
	public static void main(String args[])
	{
		CCount cn1=new CCount();
		CCount cn2=new CCount();
		CCount.show();
		
		CCount.setZero();
		CCount.show();
		
		CCount.setValue(4);
		CCount.show();
		
	}

}
