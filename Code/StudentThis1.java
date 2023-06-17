/* 2) this: to invoke current class method
You may invoke the method of the current class by using the this keyword. 
If you don't use the this keyword, 
compiler automatically adds this keyword while invoking the method. 
*/
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

	public void callBack()
	{
		this.display();
		System.out.println("Called display()");
	}
	
}

public class ThisReferenceVariableExample
{
	public static void main(String[] args)
	{
		Student st=new Student("Subham",101);
		st.callBack();
	}
}
