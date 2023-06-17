public class LocalVariableExample
{
	public void msg(String name,int num2,int num3)//name is local variable
	{
		int num1=100;
		System.out.println("Number 1:"+num1);
		System.out.println("Number 2:"+num2);
		System.out.println("Number 3:"+num3);
		System.out.println("Name "+name);
	}
	public static void main(String[] args)
	{
		LocalVariableExample lve=new LocalVariableExample();
		lve.msg("Praveen",200,300);
		//num1=200;  not accessible because local variable
	}
}
