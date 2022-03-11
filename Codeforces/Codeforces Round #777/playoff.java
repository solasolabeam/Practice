import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();

			System.out.println((int) (Math.pow(2, n) - 1)); 

		}
		in.close();
	}
}