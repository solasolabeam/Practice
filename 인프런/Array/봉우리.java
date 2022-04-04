import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] dx = { -1, 0, 1, 0 };    // 12�� 6��
		int[] dy = { 0, 1, 0, -1 };    // 3�� 9��
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
					if (nx>=0&&ny>=0&&nx<N&&ny<N&&arr[nx][ny] >= arr[i][j]) { // �ֺ� ������ �۰ų� ������ ����
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