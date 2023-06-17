public class StringBilderExample
{
	public static void main(String[] args)
	{
		
		StringBuilder sb=new StringBuilder();
		sb.append("Purushottam ");
		sb.append("Priyanshu ");
		sb.append("Abhishek ");
		System.out.println(sb);

		String w=String.valueOf(sb);
		System.out.println(w);

		String words=sb.toString();
		System.out.println(words);

		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);

		sb.delete(0,12);
		System.out.println(sb);
		
		//System.out.println(sb.contains("Priyanshu"));
		System.out.println(words.contains("Priyanshu"));
		System.out.println(words.contains("raju"));

		int index=sb.indexOf("Abhishek");
		System.out.println(words);
		System.out.println(index);
		
	}
}
