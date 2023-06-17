public class SubtractionProgramWithoutArithmaticOperator
{
	public int getResult(int num1,int num2)
	{
		while(num2!=0)
		{
			int carry=(~num1&num2);
			num1=(num1^num2);
			num2=(carry<<1);
		}
		return num1;
	}
	public static void main(String[] args)
	{
		SubtractionProgramWithoutArithmaticOperator apwao= new SubtractionProgramWithoutArithmaticOperator();
		int res=apwao.getResult(5,7);
		System.out.println("The Addition of Two numbers :"+res);
	}
}
