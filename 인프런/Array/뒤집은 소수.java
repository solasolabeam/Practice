import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		for(int i=0; i<N; i++) {
			String str = new StringBuilder(in.next()).reverse().toString(); // �Է� ���ڿ��� ������ �ʱ�ȭ
			int A=Integer.parseInt(str);       // ���ڿ� > ����Ÿ������
			int cnt=0;                        // �Ҽ� �Ǻ� ī��Ʈ
			for(int j=2; j<=A; j++) {
				if(A%j==0)
					cnt++;
			}
			if(cnt==1)
				System.out.print(A+" ");
		}
	}
}