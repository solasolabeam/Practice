import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		
		java.util.Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a>b) {
			System.out.println(">");			
		}
		if(a<b) {
			System.out.println("<");	
		}
		if(a==b) {
			System.out.println("==");			
		}
				
 

		
	}
}