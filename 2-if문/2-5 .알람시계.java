import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		if(b<45) {
			if(a<1) {
				System.out.print(23+" ");			
				System.out.println((60-45)+b);
				
			}
			else {
				System.out.print(a-1+" ");			
				System.out.println((60-45)+b);				
			}
			
		}
		else {
			
			System.out.print(a+" ");
			System.out.println(b-45);
		}

	
	}
}