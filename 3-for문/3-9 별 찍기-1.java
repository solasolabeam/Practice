import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int n= in.nextInt();
		
		for(int j=1; j<=n; j++) {
		for(int i=0; i<j; i++) {
			
			System.out.print("*");
		}
		System.out.println("");
		
	}
}
}