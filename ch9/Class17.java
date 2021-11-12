class Namecard
{
	private String name;
	private String address;
	private Phone data;
class Phone
{
	private String company;
	private String cell;
	
	public Phone(String s1,String s2)
	{
		company=s1;
		cell=s2;
	}
}
	public Namecard(String n,String a,String s1,String s2)
	{
		name=n;
		address=a;
		data=new Phone(s1,s2);
	}
	public void show()
	{
		System.out.println("name="+name);
		System.out.println("address="+address);
		System.out.println("company="+data.company);
		System.out.println("cell="+data.cell);
	}
	
}
public class Class17 {
 public static void main(String[] args)
 {
	 Namecard first=new Namecard("Andy","123City","2345-6789","0911-336600");
	 first.show();
 }
}
