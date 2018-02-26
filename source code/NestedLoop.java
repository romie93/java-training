
public class NestedLoop {   

    public static void main(String args[]) {
        
        int x = 0, y = 1;
        
        while(x <= 100) {
            System.out.println("x : " + x);
        
        while(y <= 50) {
            System.out.println("y : " + y);
        }
	x++; y++;
	}
    }
}