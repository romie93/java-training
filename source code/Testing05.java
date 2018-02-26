
class Testing05 {

	int x = 10;
  static int y = 20;
	void doIt() { 
	System.out.println("Hi");
  }
  
  static void dontDo() {
  	System.out.println("Bye");
  }

 public static void main(String args[]) {
	Testing05 t1 = new Testing05();
	System.out.println("x:" + t1.x);
		t1.doIt(); //use object to call the non-static 
		//doIt(); 
		dontDo();  //can call directly the static method
 }

}