import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int value = (in.nextInt() * in.nextInt() * in.nextInt()); // ���� ������ �Է��� ����
		String str = Integer.toString(value); // ���� ���� ���ڿ��� ��ȯ�Ͽ� ����

		in.close();

		for (int i = 0; i < 10; i++) { // 0~9 ���� �ش� �Ǵ� ���� ������ Ȯ��
			int count = 0; // ī��Ʈ �ϱ� ���� ���� ����
			for (int j = 0; j < str.length(); j++) { // ���� ���� �ڸ��� ��ŭ �ݺ� ����Ŭ
				if ((str.charAt(j) - '0') == i) { // �ƽ�Ű �ڵ� ���ڸ� 10������ ��ȯ�ϰ�, 0~9 ���� �ش� �Ǵ� ���� ������ Ȯ��
					count++; // �ش� ���ڰ� ���� �ִ��� ī��Ʈ
				}

			}
			System.out.println(count); // ī���� �� ���� �� �ڸ������� ���
		}

	}

}
