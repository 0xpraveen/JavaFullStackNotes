/* 1) this: to refer current class instance variable
The this keyword can be used to refer current class instance variable.
If there is ambiguity between the instance variables and parameters, 
this keyword resolves the problem of ambiguity. */

class Student
{
	String name;
	int roll;
	Student(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}

	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Roll :"+roll);
	}
}

public class ThisReferenceVariableExample
{
	public static void main(String[] args)
	{
		Student st=new Student("Subham",101);
		st.display();
	}
}
