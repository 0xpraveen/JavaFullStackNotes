/* Keypoit[instance variable take more memory but static variable takes less memory company wants static one due to less memory uses.]

3.Static varriable -> which variable is declared with static keyword that is static variable. It can be accessible in both inside the block
  and outside the block. Its class level member, so the memory and value will be initialized during the loading class. It remains until program executing.
  Its accessible from non-static and static context both. Always it keeps updated value. */

//EXAMPLE..
public class StaticVariableExample
{
	static int num;
	public void fun1()
	{
		num=100;
		System.out.println("Number :"+num);
	}
	public static void main(String[] args)
	{
		System.out.println("Number in main() :"+num);
		StaticVariableExample sve=new StaticVariableExample();
		sve.fun1();
	}
}
