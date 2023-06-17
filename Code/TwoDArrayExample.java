// Wap to insert data in 2d array and print it .
import java.util.*;
class TwoDArrayExample
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		int[][] arr=new int[2][3];
		
		// To insert data in 2 d array
		for(int row=0;row<2;row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.println("Enter data arr["+row+"]["+col+"] :");
				arr[row][col]=input.nextInt();
			}
		}

		//Print 2 d array
		for(int row=0;row<2;row++)
		{
			System.out.print("Row No :"+row+" : ");
			for(int col=0;col<3;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
	}
}


