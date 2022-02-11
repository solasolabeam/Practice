import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int Y = 0; // ������ ��� : 30�ʸ��� 10
		int M = 0; // �ν��� ��� : 60�ʸ��� 15

		int[] arr = new int[A]; // ��ȭ ���� �Է�

		for (int i : arr) {
			arr[i] = in.nextInt();

			Y += (arr[i] / 30) * 10 + 10; // 30�� �̸� 10
			M += (arr[i] / 60) * 15 + 15; // 60�� �̸� 15

		}
		if (Y > M) { // �ν��̰� �� ����
			System.out.println("M" + " " + M);
		} else if (Y < M) { // �����̰� �� ����
			System.out.println("Y" + " " + Y);
		} else { // ��� ����
			System.out.println("Y M" + " " + Y);
		}
		in.close();
	}
}
