
package errorhandling ;

class ErrorChecking {

  public static void main(String args []) {

		int x = 10;
		int y = 0;
		int z = 0;

	try {

		z = x / y;
	
	}
	
	catch (Exception err) {

		System.out.println(err.getMessage());

	}

	System.out.println(z);
  }
}