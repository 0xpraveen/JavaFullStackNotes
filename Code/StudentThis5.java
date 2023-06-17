/* 5) this: to pass as argument in the constructor call
We can pass the this keyword in the constructor also. 
It is useful if we have to use one object in multiple classes. 
Let's see the example:

Example: */

class Student
{
	public Student()
	{
		Student st=this.getStudentObj(this);//passing argument by this keyword
		System.out.println("Default Constructor ");
	}
	public Student getStudentObj(Student st)
	{
		System.out.println("Invoked getStudentObj(new Student())");
		return st;
	}

	
}

public class ThisReferenceVariableWithArgument
{
	public static void main(String[] args)
	{
		Student st=new Student();
	}
}

