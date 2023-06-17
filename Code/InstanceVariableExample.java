/* Instance variable -> n instance variable, also known as a member variable or an object-level variable,
  is a variable declared within a class but outside any method or constructor.
  Unlike local variables, instance variables belong to a specific instance of a class and can be
  accessed and modified by any method or constructor within that instance. */

//EXAMPLE..
public class InstanceVariableExample
{
	String college;//Instance variable
	int num1;//instance variable
	public void fun1()
	{
		college="LPU";
		System.out.println("College :"+college);
	}
	public void fun2()
	{
		System.out.println("College :"+college);
	}
	public static void main(String[] args)
	{
		System.out.println("College :"+college);//ERROR-> non-static can't access from static context
		InstanceVariableExample ive=new InstanceVariableExample();
		ive.fun1();
		ive.fun2();
	}
}
