package problem4;
import java.util.*;
import java.io.*;
public class average {
	
	
		public static void main(String args[])
		{
			Scanner nums = null;
			try
			{
				nums = new Scanner(new FileInputStream("numbers2.txt"));
			}
			catch(FileNotFoundException e)
			{
				System.out.println("file not found.");
			}
			double sum= 0;
			int number= 0;
			while(nums.hasNextDouble())
			{
				sum +=nums.nextDouble();
				number++;	
			}
			System.out.println("The average " +sum/number);
			nums.close();
		
	}

}
