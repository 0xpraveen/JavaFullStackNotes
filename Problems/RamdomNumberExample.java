 //WAP to generate Random number.
import java.util.*;
public class RamdomNumberExample
{
	public static void main(String[] args)
	{
		Random r=new Random();
		System.out.println("OTP :"+r.nextInt(1000));
	}
}
