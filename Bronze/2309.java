import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int X = 9;    // 입력받은 수
		int sum = 0;
		int A = 0;    // 스파이 1
		int B = 0;    // 스파이 2

		int[] arr = new int[X];

		for (int i = 0; i < X; i++) {
			arr[i] = in.nextInt();
			sum += arr[i];   // 배열에 모두 저장
		}
		Arrays.sort(arr);    // 순서대로 정렬
		for (int i = 0; i < X; i++) {        // 브루트 포스
			for (int j = 0; j < X; j++) {    
				if (sum - 100 - arr[i] == arr[j]) { // 모든 값의합-100
					A = i;    // 스파이 1 의 배열 첨자
					B = j;    // 스파이 2 의 배열 첨자
				}
			}
		}
		for (int i = 0; i < X; i++) {
			if (i == A || i == B)  // 스파이 1,2를 제외한 나머지 출력
				continue;
			System.out.println(arr[i]);

		}
		in.close();
	}
}
