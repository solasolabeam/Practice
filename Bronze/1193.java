import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int cnt = 0; // �� ��ȣ
		int sum = 0; // �հ�

		while (true) {
			cnt++;
			sum += cnt;
			if (sum >= X) {
				if (cnt % 2 != 0) {   // �� ��ȣ�� Ȧ�� �̸�
					System.out.println((sum-X+1) + "/" + (X-sum+cnt));

				} else {          // ¦�� ���
					System.out.println((X-sum+cnt) + "/" + (sum-X+1));

				}
				break;

			}
		}
	}
}