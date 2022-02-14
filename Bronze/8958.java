import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();    // 반복 횟수

		for (int i = 0; i < a; i++) {
			String arr = in.next();
			int sum = 0;     // 누적 합계
			int count = 0;   // 누적 카운트
			for (int j = 0; j < arr.length(); j++) {
				if (arr.charAt(j) == 'O') {
					count++;
					sum += count;

				} else {
					count = 0;
				}
			}
			System.out.println(sum);
		}
		in.close();

	}
}