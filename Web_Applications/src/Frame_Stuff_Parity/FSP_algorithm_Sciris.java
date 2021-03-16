/*
 * Written by: Emmanuel Olatunde
 * Course: CSAS 3211WA
 * Program: Frame-Suff-Parity Program
 * Description: a program that reads a (long) sequence of bits from a file, separates the data 
 * into frames, unstuffs the data, and checks the parity of each frame for errors. One or more 
 * of the frames will be 'bad'
 * */

package Frame_Stuff_Parity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FSP_algorithm_Sciris {

	//Global Variables
	public static String FRAME_BYTE = "01111110" ;
	public static String FILENAME = "sample_data_3.txt";
	public static int numberOfFrames = 0;
	public static ArrayList<String> parityBits = new ArrayList<String>(); 
	public static ArrayList<Integer> numberOfOnes = new ArrayList<Integer>(); 
	
	//Method to read file
	public static String readFile(String file) {
		String data = "";
		try
		{
		    BufferedReader in = new BufferedReader(
		                           new FileReader(
		                               new File(file)));
		    data = in.readLine();
		    in.close();
		}
		catch(IOException ioe)
		{
		   System.err.println("Error: " + ioe);
		}
		return data;
	}
		
	// Method to split a String consisting of 0's and 1's at the FRAME_BYTEs.
	// INPUT: String representing a bit stream of o's and 1's
	// OUTPUT: returns a list of non-empty "frames"
	public static ArrayList<String> getFrames(String data)
	{
	    String[] frames = data.split(FRAME_BYTE);
	    // Removing empty frames (between two consecutive FRAME_BYTEs) 
	    ArrayList<String> notEmptyFrames = new ArrayList<String>();
	    for (String frame : frames)
	       if (!frame.equals(""))
	            notEmptyFrames.add(frame);
	    numberOfFrames = notEmptyFrames.size();
	    return notEmptyFrames;
	}

	//Method to  replacing all oldString with newString
	public static ArrayList<String> replaceString(String oldString, String newString, ArrayList<String> data) {
		ArrayList<String> refinedData = new ArrayList<String>();
		for (String chunk : data)
			refinedData.add(chunk.replaceAll(oldString, newString));
		return refinedData;
	}
	
	//Method to count frequency of particular character in a string
	public static int countChar(char chr, String word) {
		int count = 0;
		for(int i=0; i < word.length(); i++) {
			if(word.charAt(i) == chr) {
				count++; }
			}
		return count;
		}
	
	//Method to determine the parity bits and number of 1s
	public static void validateFrame(ArrayList<String> data) {
		for (String chunk : data) {
			//Adds the last item of the chunk to parityBits
			parityBits.add(String.valueOf(chunk.charAt(chunk.length()-1)));
			//Adds the sum of 1s to numberOfOnes
			numberOfOnes.add(countChar('1',chunk.substring(0,chunk.length()-1)));
		}
	}
	
	public static void main(String[] args) throws IOException {
		if (args.length >= 1){
	        try{
	          FILENAME = args[0];
	          }
	        catch(NumberFormatException nfe){
	          System.err.println("Syntax Format: java 'class' 'Filename'");
	          System.err.println("Filename must be a String (i.e sample_data_1.txt)");
	          System.err.println("Using default File '" +FILENAME+"'");
	          }
	    	}

		ArrayList<String> data = new ArrayList<String>();
		//To read the file and remove the FRAME_BYTEs to get stuffed data
		data = getFrames(readFile(FILENAME));
		//To replace instances of 111110 with 11111
		String a = "111110", b= "11111";
		data = replaceString(a,b,data);
		//To obtain parityBits and numberOfOnes in each frame
		validateFrame(data);
		//To print output based on validity logic
		System.out.println(FILENAME);
		System.out.println("Found "+numberOfFrames+" frames in the data");
		for(int i = 0; i < numberOfFrames; i++) {
			if((parityBits.get(i).equals("0")) && (numberOfOnes.get(i)%2 == 0)) {
				System.out.println("Frame "+(i+1)+": "+data.get(i).substring(0,(data.get(i).length()-1)));
			}
			else if((parityBits.get(i).equals("1")) && (numberOfOnes.get(i)%2 == 1)) {
				System.out.println("Frame "+(i+1)+": "+data.get(i).substring(0,(data.get(i).length()-1)));
			}
			else {
				System.out.println("Frame "+(i+1)+": is Corrupt!");
			}
		}
	} 
	
	
}
