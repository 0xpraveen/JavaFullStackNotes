public class ArithmeticOperatorExample
{
	public static void main(String[]args)
	{
		long mbno=918543051584L;
		System.out.println("Mobile No. :"+mbno);

		long countrycode=mbno/10000000000L;
		mbno=mbno%10000000000L;
		System.out.println("countrycode :"+countrycode);
		System.out.println("Mobile Number :"+mbno);
	}
}
