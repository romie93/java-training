
interface Modem {
  public boolean open();                               
  public boolean close();
  public int read ();
  public int write();

}
//...............................................................

class MindStickModem implements Modem {
        public boolean open() {

             // implementation
		System.out.println("Started a MindStickModem \n");
		return true;

                }

        public boolean close() {

             // implementation
		System.out.println("Closed a MindStickModem \n");
		System.out.println("...............................\n");
		return false;

                }

        public int read() {

             // implementation
		System.out.println("Reading a MindStickModem way \n");
		return 100;

                }

        public int write() {

             // implementation
		System.out.println("Written a MindStickModem way \n");
		return 100;

                }

}


class HuaweiModem implements Modem {
         public boolean open() {

             // implementation
		System.out.println("Started a HuaweiModem \n");
		return true;

                }

         public boolean close() {

             // implementation
		System.out.println("Closed a HuaweiModem \n");
		return false;

                }

         public int read() {

             // implementation
		System.out.println("Reading a HuaweiModem way \n");
		return 200;

                }

         public int write() {

             // implementation
		System.out.println("Written a HuaweiModem way \n");
		return 200;

                }


}

public class ModemTesting {
	public static void main(String args[]) {

	Modem MindStickModem = new MindStickModem();
	MindStickModem.open();
	MindStickModem.write();
	MindStickModem.read();
	MindStickModem.close();


	Modem HuaweiModem = new HuaweiModem();
	HuaweiModem.open();
	HuaweiModem.write();
	HuaweiModem.read();
	HuaweiModem.close();
	}
}
 