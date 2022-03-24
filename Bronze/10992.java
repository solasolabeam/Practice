import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 1; i <= N; i++) {
			if(i!=N) {
			for (int j = 0; j < N - i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=0; j<2*(i-1)-1; j++) {
				System.out.print(" ");
			}
			if(i!=1)
			System.out.print("*");

			System.out.println();
			}
			else {
				for(int k=0; k<2*N-1; k++) {
					System.out.print("*");
				}
			}
		}
	}
}