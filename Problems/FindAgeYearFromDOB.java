/* Wap to take dob of user and print their year of age.
Example:
Input:
Enter your dob:1960-01-01

output:
You are 63 years old.
*/
import java.text.*;
import java.util.*;
public class FindAgeYearFromDOB
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		SimpleDateFormat sdf=new SimpleDateFormat("MM-DD-YYYY HH:MM:SS");
		
		System.out.println("Enter your dob:");
		String dob=input.nextLine();

		long d=System.currentTimeMillis();

		Date todaydate=new Date(d);

		Date date1=sdf.parse(todaydate);
		Date date2=sdf.parse(dob);

		long difference=date1.getTime()-date2.getTime();
		
		int year=(difference/60*60*24)%365;

		System.out.println("Your are "+year+" old");
				
	}
}
