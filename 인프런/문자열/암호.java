import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N =in.nextInt();
		String str =in.next();

		for(int i=0; i<N; i++) {
			String tmp =str.substring(0,7).replace("*","0").replace("#", "1");             // ���ڿ����� 7���� �̱�
			int a = Integer.parseInt(tmp, 2); // 2������ 10������ ��ȯ
			System.out.print((char)a);       // �ƽ�Ű �ڵ�� ��ȯ
			str=str.substring(7);          // ���� ���� ���ڿ� �غ�
		}
	}
}