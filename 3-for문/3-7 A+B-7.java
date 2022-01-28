import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int n= in.nextInt();
		
		
		
	    int i=0;
		for(i=1; i<=n; i++) {
			
			int A = in.nextInt();
			int B = in.nextInt();
			
			System.out.println("Case #"+i+": "+(A+B));
		
		}
        in.close();
	}
}