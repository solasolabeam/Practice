import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String S = in.next();
		int[] arr = new int[26];  // a~z ���� ���ĺ� �� 26�ڸ� �迭�� ����
		int alpa = 0;   // ���ڷ� ���� ���ĺ��� ������ ��ȯ ex) 'a'-> 65  // 'a'-'a'= 0
		for (int i = 0; i < 26; i++) {
			arr[i] = -1;   // ��� ���ҵ��� -1�� ����
		}
		for (int i = 0; i < S.length(); i++) {
			alpa = S.charAt(i) - 'a';  // ���ĺ� a���� z������ 0~25�� �ްԲ� ����

			for (int j = 0; j < 26; j++) { //  �� �ڸ��� ���ĺ� �ϳ��ϳ� �˺� 
				if (j == alpa) {    // ���� ������ ���ĺ� ���� ��ġ�ϸ�, �� ��ġ�� �ܾ��� �ڸ����� ����
					if (arr[alpa] > -1)  // ���� ���� �ѹ��̻� �ڸ����� ���� �޾Ҵٸ� 
						continue;        //  ����
					arr[alpa] = i;    //  �� ��ġ�� �ܾ��� �ڸ����� ����
				}
			}
		}
		for (int i : arr) {  // �迭�� �ִ� ���ҵ��� �ϳ��� ��� ���
			System.out.println(i);
		}

	}
}