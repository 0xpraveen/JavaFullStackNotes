/* 6) this keyword can be used to return current class instance
We can return this keyword as an statement from the method. In such case, return type of the method must be the class type (non-primitive). Let's see the example:
Example: */

final class Student
{
	//Singleton design pattern
	private static Student obj;
	private Student()
	{
		System.out.println("Default Constructor");
	}
	public static Student getObject()
	{
		if(obj==null)
			return new Student();
		else
			return obj;
	}
}

public class ThisForReturnObject
{
	public static void main(String[] args)
	{
		Student st=Student.getObject();
	}
}
