import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int Y = 0; // 영식이 계산 : 30초마다 10
		int M = 0; // 민식이 계산 : 60초마다 15

		int[] arr = new int[A]; // 통화 갯수 입력

		for (int i : arr) {
			arr[i] = in.nextInt();

			Y += (arr[i] / 30) * 10 + 10; // 30초 미만 10
			M += (arr[i] / 60) * 15 + 15; // 60초 미만 15

		}
		if (Y > M) { // 민식이가 더 저렴
			System.out.println("M" + " " + M);
		} else if (Y < M) { // 영식이가 더 저렴
			System.out.println("Y" + " " + Y);
		} else { // 계산 동일
			System.out.println("Y M" + " " + Y);
		}
		in.close();
	}
}
