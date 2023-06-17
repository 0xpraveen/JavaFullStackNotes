public class PrimitiveDataTypesExample
{
	public static void main(String[] args)
	{
		short s=100;
		System.out.println("Size of Short data type :"+(Short.SIZE/8)+" bytes");//for get the size of datatype
		System.out.println("short s:"+s);
		
		//byte b=9111;//error: incompatible types: possible lossy conversion from int to byte
		byte b=10;
		System.out.println("Size of Byte data type :"+(Byte.SIZE/8)+" bytes");//for get the size of datatype
		System.out.println("Byte b:"+b);
		
		int i=10;
		System.out.println("Size of Interger data type :"+(Integer.SIZE/8)+" bytes");//for get the size of datatype
		System.out.println("Integer i:"+i);
		
		long l=8999;
		System.out.println("Size of Long data type :"+(Long.SIZE/8)+" bytes");//for get the size of datatype
		System.out.println("Long l:"+l);
		
		//float f=189.9;// error: incompatible types: possible lossy conversion from double to float
		float f=18999.9f;//in float we will use f in the last
		System.out.println("Size of Float data type :"+(Float.SIZE/8)+" bytes");//for get the size of datatype
		System.out.println("Float f:"+f);

		double d=1899.45;
		System.out.println("Size of Double data type :"+(Double.SIZE/8)+" bytes");//for get the size of datatype
		System.out.println("Double d:"+d);
		
		char ch='A';
		System.out.println("Size of Character data type :"+(Character.SIZE/8)+" bytes");//for get the size of datatype
		System.out.println("Char ch:"+ch);
		
		boolean bool=true;
		//System.out.println("Size of Boolean data type :"+(Boolean.SIZE/8)+" bytes");//for get the size of datatype // error: cannot find symbol
		System.out.println("Boolean bool:"+bool);
	}
}
