public class StringBuffersExamples
{
	public static void main(String[] args)
	{
		StringBuffer buffers=new StringBuffer();
		buffers.append("Sivani ");
		buffers.append("Kalra ");
		buffers.append("Jiwan ");
		System.out.println(buffers);

		buffers.insert(7,"Ronak ");
		System.out.println(buffers);

		buffers.insert(0,"Anuj ");
		System.out.println(buffers);

		int len=buffers.length();
		System.out.println("Length of buffers :"+len);
		
		buffers.insert(len-1," Shubham ");
		System.out.println(buffers);

		len=buffers.length();
		System.out.println("Length of buffers :"+len);


		buffers.reverse();
		System.out.println(buffers);
		
		
	}
}
