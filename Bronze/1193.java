import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int cnt = 0; // 행 번호
		int sum = 0; // 합계

		while (true) {
			cnt++;
			sum += cnt;
			if (sum >= X) {
				if (cnt % 2 != 0) {   // 행 번호가 홀수 이면
					System.out.println((sum-X+1) + "/" + (X-sum+cnt));

				} else {          // 짝수 라면
					System.out.println((X-sum+cnt) + "/" + (sum-X+1));

				}
				break;

			}
		}
	}
}