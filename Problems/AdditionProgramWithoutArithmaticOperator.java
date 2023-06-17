/* Question:- Wap to add two integer without using + operator or unary operator
Solution:- */
 
public class AdditionProgramWithoutArithmaticOperator
{
	public int gerResult(int num1,int num2)
	{
		while(num2!=0
		{
			int carry=(num1&num2);
			num1=(num1^num2);
			num2=(carry<<1);
		}
		return num1;
	}
	public static void main(String[] args)
	{
		AdditionProgramWithoutArithmaticOperator apwao= new AdditionProgramWithoutArithmaticOperator();
		int res=apwao.getResult(7,5);
		System.out.println("The Addition of Two numbers :"+res);
	}
}
