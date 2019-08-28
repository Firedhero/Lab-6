package problem1;


	import java.io.BufferedReader;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.util.Arrays;
	public class Names {	
		private String[] boyNames=new String[1000];
		private int[] numBoys=new int[1000];
		private String[] girlNames=new String[1000];
		private int[] numgirls=new int[1000];
		private String name;
		String[] names=new String[1000];
		int[] tot=new int[1000];
		String[] names2=new String[1000];
		int[] tot2=new int[1000];	
		public void readNames() {		
			try {			
				BufferedReader Gn = new BufferedReader(new FileReader("girlnames.txt"));
				String line=null;
				int splitCount=0;
				int splitCount2=0;
				while((line = Gn.readLine()) != null) {
					//splits at any space
//					for(int i=0;i<girlNames.length;i++) {
					String[] splitter=line.split(" ");
					names[splitCount]=splitter[0];
					tot[splitCount]=Integer.parseInt(splitter[1]);				
//					gnames[i]=Gn.readLine();
					this.girlNames = names;
					this.numgirls = tot;
					splitCount++;
//				}
				}
				Gn.close();
				BufferedReader Bn = new BufferedReader(new FileReader("boynames.txt"));
				String line2=null;
				while((line2 = Bn.readLine()) != null) {
					//splits at any space
//					for(int i=0;i<boyNames.length;i++) {
					String[] splitter2=line2.split(" ");
					names2[splitCount2]=splitter2[0];
					tot2[splitCount2]=Integer.parseInt(splitter2[1]);
					this.boyNames = names2;
					this.numBoys = tot2;
//					gnames[i]=Gn.readLine();
					splitCount2++;
				}
//			}
				Bn.close();
				}catch (FileNotFoundException e)
			{
					System.out.println("File not found.");
					e.printStackTrace();
	        }catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
				
				
			}
				 
		}
		public Names(String Name){
			readNames();
			this.name=Name;
			if (Arrays.asList(this.boyNames).contains(name)){
				//finds the the position of the name in list
				int index = Arrays.asList(this.boyNames).indexOf(name);
				//finds how many times it occurs
				int occurences = numBoys[index];
				System.out.println(name +" is ranked "+(index + 1)+" in popularity "+"among boys with "+occurences+ " namings.");
			} else
				System.out.println(name + " is not ranked among the top 1000 boy names.");

			if (Arrays.asList(this.girlNames).contains(Name)){
				//finds the the position of the name in list
				int index = Arrays.asList(this.girlNames).indexOf(name);
				//finds how many times it occurs
				int occurences = numgirls[index];
				System.out.println(name + " is ranked " + (index + 1) + " in popularity " + "among girls with " + occurences
						+ " namings.");
			} else
				System.out.println(name + " is not ranked among the top 1000 girl names.");
	System.out.println("-------------------------------------------------------------");
		}
		 public static void main(String[] args){
				
				Names[] namearray=new Names[3];
				namearray[0]=new Names("Billy");
				namearray[1]=new Names("Emma");
				namearray[2]=new Names("Madison");
				}
	}

