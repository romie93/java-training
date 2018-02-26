/*
 * This program cannot run or compile because there are not have a constructor(no arguments)
 */


class Test {

  Test(int x) {
 }
  Test(int x, int y) {
 }
  Test(String x, String y) {
 }

  public static void main(String args[]) {
	Test x = new Test();
  }

}