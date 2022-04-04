import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			String str = in.next();
			StringBuilder sb = new StringBuilder(str);
			System.out.println(sb.reverse().toString());

		}
	}
}