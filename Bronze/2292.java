import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = 0;// ���� �ش�Ǵ� ���� ����
		int sum= 1; // �� ���� ��� ���� ����
		int layer = 1; // �� �� = �ּҰ�
		int N = in.nextInt();

			while (N > sum) {						
				cnt +=6;
				sum += cnt;
				layer++;
			}
			System.out.println(layer);
		
		in.close();
	}
}