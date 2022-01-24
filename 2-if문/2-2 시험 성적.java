import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		if(90<=a && a<=100) {
			System.out.println("A");
		}
		if(80<=a && a<=89) {
			System.out.println("B");
		}
		if(70<=a && a<=79) {
			System.out.println("C");
		}
		if(60<=a && a<=69) {
			System.out.println("D");
		}
		if(a<60) {
			System.out.println("F");
		}
			       

	}
}