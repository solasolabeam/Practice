
import java.util.Scanner;

public class Main {                    

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<5; i++) {
			int a = in.nextInt();  // 5���� �Է��� ����
			sum +=Math.pow(a, 2);  // �ŵ�����
			
		}
	

		
		System.out.println(sum%10);
	}
}
