import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int A = N;
		for (int j = 0; j < N; j++) { // N�� ���� ����
			for (int i = 0; i < A; i++) {  //N���� ��� 
				System.out.print("*");
			}
			A--;   // ���� ���� �ϳ��� ���̱�
			System.out.println();
		}
		in.close();
	}
}
