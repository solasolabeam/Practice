
import java.util.Scanner;

public class Main {                    

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();       // ��� �� 
		int B = in.nextInt();       // ����
		int[] arr = new int[5];     // �Ź� ����� ������� �����ϱ� ���� �迭 
		for(int i=0; i<5; i++) {
			arr[i] = in.nextInt();  // 5���� �Ź�
			
		}
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]-A*B+" ");  


			
		}


	}
}
