// this program without throws exception 


import java.io.*;
class CheckedException2 {  
   public static void main(String args[])
   {
	FileInputStream fis = null;
	try{      // cannot run/reading the input txt bcoz the name of input is false.
	    fis = new FileInputStream("inputx.txt"); 
	}
	catch(FileNotFoundException fnfe) {
            System.out.println("The specified file is not " +
			"present at the given path");
	 }
	int k; 
	try{
	    while(( k = fis.read() ) != -1) 
	    { 
		System.out.print((char)k); 
	    } 
	    fis.close(); 
	}
	catch(IOException ioe) {
	    System.out.println("I/O error occurred: "+ioe);
	 }
   }
}