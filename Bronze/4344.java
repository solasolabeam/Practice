import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();

		for (int i = 0; i < A; i++) {
			double sum = 0; // �л��� ���� ��
			double avg = 0; // ���� ���
			double cnt = 0; // ������� �̻��� �л� ��
			
			int B = in.nextInt();
			int[] arr = new int[B];
			for (int j = 0; j < B; j++) { // �׽�Ʈ ���̽� �ݺ�
				arr[j] = in.nextInt();
				sum += arr[j];

			}
			avg = sum / B;   

			for (int j = 0; j < B; j++) {// �л� �� ��ŭ �ݺ�
				if (arr[j] > avg) {
					cnt++;      // ��պ��� ���� �л� ����
				}
			}

			
			System.out.printf("%.3f%%\n",cnt/B*100);

		}
		in.close();
	}
}