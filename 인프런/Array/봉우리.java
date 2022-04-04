import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] dx = { -1, 0, 1, 0 };    // 12시 6시
		int[] dy = { 0, 1, 0, -1 };    // 3시 9시
		int N = in.nextInt();
		int[][] arr = new int[N][N];
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				boolean check = true;
				for (int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if (nx>=0&&ny>=0&&nx<N&&ny<N&&arr[nx][ny] >= arr[i][j]) { // 주변 값보다 작거나 같으면 무시
						check = false;
						break;
					}
				}
				if (check)
					cnt++;
			}

		}
		System.out.println(cnt);

	}
}