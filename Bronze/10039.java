import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		int X = 5;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < X; i++) {
			int A = in.nextInt();
			if (A < 40) {
				A = 40;
			}
			sum += A;
		}
		System.out.print(sum/5);

	}
}