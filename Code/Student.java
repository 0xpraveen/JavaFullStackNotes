
//example of an instance method
class Student
{
	Student()
	{
		NonStaticMethodExample.msg1();
	}
}

public class NonStaticMethodExample
{
	public void msg()
	{
		System.out.println("Welcome to non-static method msg()");
	}
	public static void msg1()
	{
		System.out.println("Welcome to static method msg1()");
	}

	public static void main(String[] args)
	{
		NonStaticMethodExample nsme=new NonStaticMethodExample();
		nsme.msg();
		
		msg1();
		NonStaticMethodExample.msg1();

		Student st=new Student();
		nsme.msg1();
		
	}
}

