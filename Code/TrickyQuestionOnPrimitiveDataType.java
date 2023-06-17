public class TrickyQuestionOnPrimitiveDataType
{
	public static void main(String[] args)
	{
		byte b1=10;
		byte b2=20;
		//byte b3=b1+b2;//error
		byte b3=(byte)(b1+b2);
		System.out.println("Result of b1+b2 :"+b3);
		
		float f1=23.45f;
		float f2=20.30f;
		float f3=f1+f2;
		System.out.println("Result of f1+f2 :"+f3);

		float num=0.7f;
		if(num==0.7)
		System.out.println("Equal");
		else
		System.out.println("Not Equal");
		if(num>=0.7)
		System.out.println("Equal");
		else
		System.out.println("Not Equal");

		char alpha='A';
		//alpha=alpha+1;//error
		alpha=(char)(alpha+1);
		System.out.println(alpha);
	}
}
