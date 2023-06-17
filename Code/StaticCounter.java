public class StaticCounter
{
	static int count=0;
	public StaticCounter()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		StaticCounter st=new StaticCounter();
	}
}
