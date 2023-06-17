public class LargestAmongThreeNumber
{
	public static void main(String[] args)
	{
		int num1=7;
		int num2=5;
		int num3=9;
		num1=(num1>num2)?num1:num2;
		num1=(num1>num3)?num1:num3;
		System.out.println("Largest number among three is :"+num1);
	}
}
