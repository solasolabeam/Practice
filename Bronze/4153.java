import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		for(int i=0; i<3000; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			 if (a == 0 && b == 0 && c == 0) {
				break;
			}
			if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
				System.out.println("right");
			else if(Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
				System.out.println("right");
			}
			else if(Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2)) {
				System.out.println("right");
			}
			
			else
				System.out.println("wrong");

		}
	}
}