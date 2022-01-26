import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) {
		
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int arr[] = new int[a];
		
		for(int i =0; i<a; i++) {
			
			int b= in.nextInt();
			int c= in.nextInt();
						
			
		arr[i] = b+c;
									
		}
		
		for(int g : arr) {
			System.out.println(g);
		}
				
		
		
	}
}