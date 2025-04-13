package studentsRegularArray;
import java.util.*;
public class studentsProgram {
	
	public static void main(String[] args)
	{ 
		try {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Number of Cities : ");
		
		int [][][] arr = new int [sc.nextInt()][][];
		System.out.println("Enter the Number of Schools : ");
		
		for(int i = 0; i <= arr.length-1; i++)
		{
			for(int j = 0; j <arr[i].length-1; j++)
			{
				for(int k = 0; k < arr[i][j].length-1;k++)
				{
				//	arr[i][j] [sc.nextInt()][];
				}
			}
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception Handlel");
		}
		
	}
}
