import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		
		int cnt = 0;  // �ɸ��� �ð��� ����
		String[] S = { "0", "0", "0", "ABC", "DEF", "GHI", // ABC:4�� �̱⶧���� [4]�� ���� 
				     "JKL", "MNO", "PQRS", "TUV", "WXYZ" };// DEF:5�� �̱⶧���� [5]�� ����

		for (int j = 0; j < s.length(); j++) {  // ������� �Է°��� ���̸�ŭ �ݺ�
			for (int i = 0; i < S.length; i++) { 
				if (S[i].contains(Character.toString(s.charAt(j)))) { // �Է��� ���ĺ��� �迭�� ����� ����������
					                                                  // �Ǿ��ִٸ� �迭�� �ε����� ��ȣ�� ���� cnt�� ����
					cnt += i;                                         // �迭 �ε��� = �Է��ǰɸ��� �� �̱⶧��

				}

			}
		}

		System.out.println(cnt);
	}
}