import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] arr= {in.nextInt(),in.nextInt(),in.nextInt()};  // ����ڷκ��� �Է��� 3�� �޴´�
		in.close();
		Arrays.sort(arr); // ���� ���� �޼ҵ�
		
		for(int N : arr) {  // �迭�� ����� ���� �ϳ��� ���
			System.out.print(N+" ");
		}


	}
}
