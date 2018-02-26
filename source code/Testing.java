
class Testing {

	Testing(int x, int y) {
	  System.out.println("x:" + x + " " + "y:" + y);
	}

	Testing (String name, int age) {
	  System.out.println("Name:" + name + " " + "Age:" + age);
	}

  public static void main(String x[]) {

	Testing t1 = new Testing("Romie", 25);
	Testing t2 = new Testing(20,200);
  }
}