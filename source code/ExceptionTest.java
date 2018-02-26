

class ExceptionTest {

  public static void main(String args[]) {

	int x = 10;
	int y = 5; //if write the value "0", the error will be display(ArithmeticException)
	int z = 0;

	try {
		z = x/y;
	}
	
	catch(ArithmeticException e) {
		System.out.println("Cannot Dividing by zero! : this is the error : " + e);
	}
	  System.out.println(z);
  }

}