//Local Variable -> a local variable is a variable that is declared within a block of code, such as a method, constructor, or a block of code inside a method.
  //It is defined with a specific data type and can only be accessed within the scope of the block where it is declared.

public class LocalVariableExample
{
	public void msg()//msg(String name) this is also a local variable
	{
		int num=100;//Local variable
		System.out.println("num:"+num);
		System.out.println("Name "+name);
	}
	public static void main(String[] args)
	{
		LocalVariableExample lve = new LocalVariableExample();
			lve.msg("Praveen");// method msg in class LocalVariableExample cannot be applied to given types;
                        			//lve.msg("Nirbhay");
                           				^
  						//required: no arguments
  						//found: String
  						//reason: actual and formal argument lists differ in length
			num=200;//there is error like cannot find the symbol num=200; 
			//symbol: variable num,location: class LocalVariableExample
			//num=200; not accessible because local variable
	}
}
