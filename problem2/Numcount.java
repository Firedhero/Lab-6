package problem2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Scanner;

import problem1.Names;
public class Numcount {
	static File f = new File("numbers.txt");
	static int[] test=new int[(int)f.length()];
	
	static int total=0;
	
	
	
	public static void numbers(){
		Scanner numbs = null;

		int count=0;
		
		try
		{
			numbs = new Scanner(new FileInputStream("numbers.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Sorry, this file could not not be found.");
		}
		
		try {			
			
			int[] numbers=new int[count];
		while( numbs.hasNextInt()) {

					test[count]=numbs.nextInt();
//				System.out.print(test[count]+", ");
		        count++;
		        
						}
		}finally {
			
			}
		}
		public Numcount(int i) {
			numbers();
			for (int x=0; x<test.length; x++) 
		        { 
				if (test[x]== i)
			     total++;
//				System.out.print(test[x]);
		        }
			System.out.print(i+" appears "+ total+" times.");
			
			
		}
	
	
	public static void main(String[] args){
		Numcount num=new Numcount(10);
//	num= new Numcount(10);
//	count(10);
}
	}
