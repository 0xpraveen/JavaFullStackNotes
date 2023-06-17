
//Example of Constructor Overloading


public class ConstructorExample
{
	public ConstructorExample()
	{
		System.out.println("Default constructor");
	}
	public ConstructorExample(String msg)
	{
		System.out.println("Parameterized constructor(msg):"+msg);
	}
	public ConstructorExample(String name,int roll)
	{
		System.out.println("Parameterized constructor(name):"+name+", Roll:"+roll);
	}
	public ConstructorExample(int roll)
	{
		System.out.println("Parameterized constructor(roll):"+roll);
	}
	public static void main(String atr[])
	{
		ConstructorExample obj1=new ConstructorExample();//default construtot will be called
		ConstructorExample obj2=new ConstructorExample("Hello Java");
		ConstructorExample obj3=new ConstructorExample(101);
		ConstructorExample obj4=new ConstructorExample("Rishabh",103);
	}		
}
