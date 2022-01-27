import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		in.close();
		
		for(int a=1; a<10; a++) {
			System.out.println(N+" * "+a+" = "+(N*a));
			
		}
		
		

	}
}