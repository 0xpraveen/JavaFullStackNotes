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
public class CopyConstructorExample 
{
	
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Student obj1=new Student("Tamanna",101);
		Student obj2=new Student(obj1);

		Student obj3=new Student();
		obj3.name=obj2.name;
		obj3.roll=obj2.roll;

		Student obj4=new Student();
		obj4=(Student)obj2.clone();

		System.out.println("Obj1 = obj1.name :"+obj1.name);
		System.out.println("Obj1 = obj1.roll :"+obj1.roll);
		
		System.out.println("Obj2 = obj2.name :"+obj2.name);
		System.out.println("Obj2 = obj2.roll :"+obj2.roll);

		System.out.println("Obj3 = obj3.name :"+obj3.name);
		System.out.println("Obj3 = obj3.roll :"+obj3.roll);

		System.out.println("Obj4 = obj4.name :"+obj4.name);
		System.out.println("Obj4 = obj4.roll :"+obj4.roll);
		
	}
}

