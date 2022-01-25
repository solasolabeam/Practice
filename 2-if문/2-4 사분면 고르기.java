import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a>0 && b>0 ) {
			System.out.println("1");								
		}
		if(a<0 && b>0 ) {
			System.out.println("2");								
		}
		if(a<0 && b<0 ) {
			System.out.println("3");								
		}
		if(a>0 && b<0 ) {
			System.out.println("4");								
		}
		
					
		
			       

	}
}