import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();  // �Է��� ����Ŭ 
��
		for (int k = 0; k < T; k++) { 
			int R = in.nextInt();  // ���ڸ�ŭ �ݺ����
			String S = in.next();  // ���ڿ�
			String sum = "";       // ���ڿ��� ������ ������ �������

			for (int i = 0; i < S.length(); i++) {  
				for (int j = 0; j < R; j++) {
					sum += Character.toString(S.charAt(i)); //���� R��ŭ �ݺ��Ͽ� ���
				}

			}
			System.out.println(sum);
		}
		in.close();

	}
}