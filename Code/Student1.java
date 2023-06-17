//Example of Static and instance block
class Student
{
	{
		System.out.println("Instance Block");
	}
	static
	{
		System.out.println("static Block");
	}
}

public class InstanceAndStaticBlock
{
	static
	{
		System.out.println("main static Block");
	}
	public static void main(String[] atr)
	{
		Student st=new Student();
	}
}

