// this program will be running bcoz the throws IOException called by JVM without catch method

import java.io.*;

class CheckedException1 {  
   public static void main(String args[]) throws IOException { 
      FileInputStream fis = null;
      fis = new FileInputStream("input.txt"); 
      int k; 

      while(( k = fis.read() ) != -1) { 
	   System.out.print((char)k); 
      } 
      fis.close(); 	
   }
}