
class NestedWhile1 {

  public static void main(String args []) {

	int outer = 1;
	while(outer < 3) {

	int inner = 5;
	while(inner < 8) {

		System.out.println(outer + " " + inner);
		inner++;
	}

	outer++;

	}	
  }
}