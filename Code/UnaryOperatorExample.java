public class UnaryOperatorExample
{
	public static void main(String[] args)
	{
		int x=10;
		x++;//Unary Operator
		x=~x;//x=x-2x-1
		int y=-10;
		y--;
		y=~y;//y=y+2y+1
		System.out.println("Value of x :"+x);
		System.out.println("Value of y :"+y);
	}
}
