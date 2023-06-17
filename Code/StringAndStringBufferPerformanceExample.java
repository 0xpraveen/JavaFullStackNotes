public class StringAndStringBufferPerformanceExample
{
	public static String getString()
	{
		String str="Java ";
		for(int i=0;i<10000;i++)
		{
			str=str+"Program";
		}
		return str;
	}
	public static String getBuffer()
	{
		StringBuffer str=new StringBuffer("Java ");
		for(int i=0;i<10000;i++)
		{
			str.append("Program");
		}
		return str.toString();
	}
	public static String getBuilder()
	{
		StringBuilder str=new StringBuilder("Java ");
		for(int i=0;i<10000;i++)
		{
			str.append("Program");
		}
		return str.toString();
	}


	
	public static void main(String[] args)
	{
		long startTime=System.currentTimeMillis();
		String strString=getString();
	System.out.println("Time taken by String :"+(System.currentTimeMillis()-startTime)+" ms.");

		startTime=System.currentTimeMillis();
		String strBuffer=getBuffer();
System.out.println("Time taken by StringBuffer :"+(System.currentTimeMillis()-startTime)+" ms.");
	
		startTime=System.currentTimeMillis();
		String strBuilder=getBuilder();
System.out.println("Time taken by StringBuilder :"+(System.currentTimeMillis()-startTime)+" ms.");
	
		
	}
}
