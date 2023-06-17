public class LabelledForLoopExample
{

	public static void main(String[] args)
	{
		
		outer:
		for(int i=0;i<5;i++)
		{
			System.out.println("I :"+i);

			inner:
			for(int j=0;j<5;j++)
			{
				System.out.println("J :"+j);
				
				if(i==2 && j==2)
				{
					break outer;
				}
				
			}
			
		}
	}
}
