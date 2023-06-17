//In this example, we are going to copy the values of one object into another using Java constructor.

class Student implementsCloneable
{
	String name;
	int roll;
	public Student()
	{

	}

	public Student(String n,int r)
	{
		name=n;
		roll=r;
	}
	public Student(Student st)
	{
		name=st.name;
		roll=st.roll;
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
