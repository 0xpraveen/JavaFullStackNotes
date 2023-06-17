final class ImmutableExample
{
	final String adharNo;
	public ImmutableExample(String adharNo)
	{
		this.adharNo=adharNo;
	}

	public String getAdhar()
	{
		return adharNo;
	}
}

public class CustomizeImmutableExample
{
	public static void main(String[] args)
	{
		ImmutableExample im=new ImmutableExample("1000000");
		String adharno=im.getAdhar();
		System.out.println("Adhar Number:"+adharno);
	}	
}
