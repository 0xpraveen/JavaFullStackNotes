// Wap to print fibonacci series upto 200 limit.

public class FibonacciSearies
{
	public static void main(String[] args)
	{
		int num1=0,num2=1;
		System.out.print(num1+",");
		System.out.print(num2+",");
		while(num2<200)
		{
			num2=num1+num2;
			System.out.print(num2+",");
			num1=num2-num1;
		}
	}
}
