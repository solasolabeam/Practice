import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M=N;
		for (int i = 0; i < N; i++) {   // 1~5�� ����
			for(int k=0; k<i; k++) {    // ��ĭ �����
				System.out.print(" ");
			}
			for (int j = 0; j < M; j++) { // �����
				System.out.print("*");
				
			}
			
			M--; // �� �ٲ� �Ҷ� ���� -1
			
			System.out.println();
		}
	}
}
