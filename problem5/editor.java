package problem5;
import java.util.Random;
import java.util.Scanner; 
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class editor {
	static File f = new File("sent.txt");
	static String[] test=new String[(int)f.length()];
		 public static void main(String[] args){
			 Scanner numbs = null; 
			 int count=0;
			 int count2=0;
			 try{
					numbs = new Scanner(new FileInputStream("sent.txt"));
				}
				catch(FileNotFoundException e)
				{
					System.out.println("Sorry, this file could not not be found.");
				}
				try {
					int[] numbers=new int[count];
				while( numbs.hasNextLine()) {

							test[count]=numbs.nextLine();
//						System.out.print(test[count]+", ");
				        count++;
								}
				}finally {					}
				//String[] sent=new String[count];
			 
			  Scanner keyboard = new Scanner(System.in);
			  String line = null; 
			  String fileName = null;
	   
	 
	System.out.println("read in sentences"); 
	try {
		 PrintWriter outputStream = null;
		 try{
	outputStream =new PrintWriter(new FileOutputStream("fileName.txt"));
	}
	catch(FileNotFoundException e){
	System.out.println("Error opening the file " + fileName);
	System.exit(0);
	}
		for(int i=0;i<count;i++) {
		line = test[count2]+".";
	fileName = "asd";
	File fileObject = new File(fileName);
	while (fileObject.exists()){
		//System.out.println("There already is a file named "+ fileName);
		System.out.println("using a different file name:"); 
	//fileName = keyboard.nextLine();
	fileObject = new File(fileName+random());
	}
		 System.out.println("Writing \"" + line + "\"");
		 System.out.println("to the file " + "fileName.txt");
		 outputStream.println(line);
		 count2++;
		}
		 System.out.println("Writing completed.");
		outputStream.close();
	}finally {		}
}
		private static String random() {
			String alphabet= "abcdefghijklmnopqrstuvwxyz";
	        String s = "";
	        Random random = new Random();
	        int randomLen = 1+random.nextInt(9);
	        for (int i = 0; i < randomLen; i++) {
	            char c = alphabet.charAt(random.nextInt(26));
	            s+=c;
	            
	        }
			return s;
		}
}