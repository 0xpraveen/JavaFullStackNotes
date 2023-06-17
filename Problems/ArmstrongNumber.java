// WAP to check given number is armstromg number or not.

import java.util.*;
public class ArmstrongNumber
{
	public static int length(int num)
	{
		int len=0;
		while(num!=0)
		{
			num=num/10;
			len++;
		}
		return len;
	}

	public static boolean isArmstrong(int num)
	{
		int power=length(num);
		int temp=num;
		double sum=0;

		while(temp!=0)
		{
			int rem=temp%10;
			double poweredValue=Math.pow(rem,power);
			sum+=poweredValue;
			temp=temp/10;
		}
		if(sum==num)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=input.nextInt();
		if(isArmstrong(num))
		{
			System.out.println(num+" is Armstrong number");
		}
		else
		{
			System.out.println(num+" is not Armstrong number");
		}
		
	}
}
