import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] asd = { 1, 2, 3, 4, 5, 6, 7, 8 };  // ascending �񱳹迭
		int[] dsd = { 8, 7, 6, 5, 4, 3, 2, 1 };  // descending �񱳹迭
		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			int N = in.nextInt();
			if (N == asd[i]) {                  // ascending �迭�� ����ϸ� cnt ����
				cnt++;
			} else if (N == dsd[i]) {
				cnt--;                          // descending �迭�� ����ϸ� cnt ����
			}
		}
		if (cnt == 8) {
			System.out.println("ascending");
		} else if (cnt == -8) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		in.close();
	}
}