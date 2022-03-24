import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 1; i <= 2*N-1; i++) {
			if (i <= N) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < (N - i) * 2; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j=0; j<N*2-i;j++) {
					System.out.print("*");
				}
				for(int j=0; j<(N-(N*2-i))*2; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<N*2-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}