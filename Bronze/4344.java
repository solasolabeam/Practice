import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();

		for (int i = 0; i < A; i++) {
			double sum = 0; // 학생들 점수 합
			double avg = 0; // 점수 평균
			double cnt = 0; // 평균점수 이상인 학생 수
			
			int B = in.nextInt();
			int[] arr = new int[B];
			for (int j = 0; j < B; j++) { // 테스트 케이스 반복
				arr[j] = in.nextInt();
				sum += arr[j];

			}
			avg = sum / B;   

			for (int j = 0; j < B; j++) {// 학생 수 만큼 반복
				if (arr[j] > avg) {
					cnt++;      // 평균보다 높은 학생 선별
				}
			}

			
			System.out.printf("%.3f%%\n",cnt/B*100);

		}
		in.close();
	}
}