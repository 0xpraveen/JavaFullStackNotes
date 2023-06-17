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
