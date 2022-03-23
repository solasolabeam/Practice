import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			String str = in.next();
			String[] arr = str.split(",");
			int A = Integer.parseInt(arr[0]);
			int B = Integer.parseInt(arr[1]);
			System.out.println(A + B);
		}
	}
}