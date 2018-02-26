
import java.io.*;  // import the whole classes
class CheckedException {  
   public static void main(String args[]) throws IOException {
	FileInputStream fis = null;
	/*This constructor FileInputStream(File filename)
	 * throws FileNotFoundException which is a checked
	 * exception
         */

	try {
        fis = new FileInputStream("input.txt"); // connect the input text in dir file
	int k; 

	/* Method read() of FileInputStream class also throws 
	 * a checked exception: IOException
         */
	while(( k = fis.read() ) != -1) 
	{ 
		System.out.print((char)k); 
	} // while ends

	/*The method close() closes the file input stream
	 * It throws IOException*/
	fis.close(); 	
	} // try end

	catch(IOException ie) {   // must catch the super class to run it
		System.out.println(ie);

	} // catch ends 
   } // main ends 
} // class ends 