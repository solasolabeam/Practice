import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] arr = new int[20];
		int temp=0;
		
		for(int i =0; i<arr.length; i++) { // 1~20 ���� ���ڰ� ����ִ� �迭
			arr[i]=i+1;
		}
		for (int i = 0; i < 10; i++) { // L~R ���� �������� ��ġ 10�� �ݺ�
			int L = in.nextInt();
			int R = in.nextInt();
			L-=1;
			R-=1;

			while(L<=R) {     // �������� �迭 �����ϱ�
				temp=arr[L];
				arr[L]=arr[R];
				arr[R]=temp;
				
				L++;
				R--;
				
			}
			

		}
		for(int i=0; i<20; i++) {   // ��ġ ���� �迭 ���ʷ� ���
			System.out.print(arr[i]+" ");
		}
in.close();
	}
}
