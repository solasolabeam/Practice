import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int X = 9;    // �Է¹��� ��
		int sum = 0;
		int A = 0;    // ������ 1
		int B = 0;    // ������ 2

		int[] arr = new int[X];

		for (int i = 0; i < X; i++) {
			arr[i] = in.nextInt();
			sum += arr[i];   // �迭�� ��� ����
		}
		Arrays.sort(arr);    // ������� ����
		for (int i = 0; i < X; i++) {        // ���Ʈ ����
			for (int j = 0; j < X; j++) {    
				if (sum - 100 - arr[i] == arr[j]) { // ��� ������-100
					A = i;    // ������ 1 �� �迭 ÷��
					B = j;    // ������ 2 �� �迭 ÷��
				}
			}
		}
		for (int i = 0; i < X; i++) {
			if (i == A || i == B)  // ������ 1,2�� ������ ������ ���
				continue;
			System.out.println(arr[i]);

		}
		in.close();
	}
}
