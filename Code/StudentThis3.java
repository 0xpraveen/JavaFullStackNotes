/* 3) this() : to invoke current class constructor
The this() constructor call can be used to invoke the current class constructor. 
It is used to reuse the constructor.
In other words, it is used for constructor chaining. */

class Student
{
	
	public Student()
	{
		System.out.println("Default Constructor");
	}
	public Student(String msg)
	{
		this();	//calling default constructor using this keyword
		System.out.println("MSG :"+msg);
		
	}
	public Student(int roll)
	{
		this("Mohan Kumar");
		System.out.println("Roll No :"+roll);
	}

	public void display()
	{
		System.out.println("Display");
	}

	
}

public class ThisReferenceVariableForConstructor
{
	public static void main(String[] args)
	{
		Student st=new Student(100);
		st.display();
	}
}
