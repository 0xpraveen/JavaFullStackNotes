public class StaticCounter
{
	static int count=0;
	public StaticCounter()
	{
		count++;
	}
	
	public static void main(String[] args)
	{
		StaticCounter st=new StaticCounter();
		StaticCounter st1=new StaticCounter();
		System.out.println(count);
	}
}
