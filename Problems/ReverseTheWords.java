// Wap to reverse the word at given position from the given string.
import java.util.*;

public class ReverseTheWords
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		System.out.println("Enter sentence :");
		String sentence=input.nextLine();

		String[] words=sentence.split(" ");

		String output="";
		for(int i=0;i<words.length;i++)
		{
			StringBuffer word=new StringBuffer();
			word.append(words[i]);
			word.reverse();
			output=output+word.toString()+" ";
			//words[i]=String.valueOf(word);	
		}
		System.out.println(output);
		
		
	}
}
