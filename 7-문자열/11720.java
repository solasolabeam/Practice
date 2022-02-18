import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String A = in.next();
		in.close();
		int sum = 0;
		for (int i = 0; i < A.length(); i++) {
			a--;
			sum += A.charAt(a) - '0';

		}
		System.out.println(sum);

	}
}