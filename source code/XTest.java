
import java.io.*; 

class XTest {
  public static void main(String args []) {

	// System.out.println(args [0]);
	// System.out.println(args [1]);

	//File f1 = new File("input.text");
	//System.out.println(f1.canRead());

	try {

	FileInputStream f = new FileInputStream("input.txt");
	f.read();
	}

	catch(FileNotFoundException fe) {

		System.out.println(fe);
	}
	
	catch(IOException ie) {

		System.out.println(ie);
	}
  }

}






//After the file input.txt in the Directory, the program will be compile.
if file not in the directory, it's will be error/cannot run.