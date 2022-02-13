import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		for (int i = 1; i < N + 1; i++) { 
			for (int j = i; j < N; j++) {   // 마지막줄 - 현재줄 = 공백
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) { // 줄 당 2n-1개씩 별 찍기
				System.out.print("*");
			}
			System.out.println();
		}
		in.close();
	}
}
