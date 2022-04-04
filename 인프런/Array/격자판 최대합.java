import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] arr=new int[N][N];
		int max=0;
		int sum1=0;
		int sum2=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j]=in.nextInt();
			}
		}
		
		for(int i=0; i<N; i++) {
			sum1=0;
			sum2=0;
			for(int j=0; j<N; j++) {
				sum1+=arr[i][j];   // �� ����
				sum2+=arr[j][i];   // �� ����
			}
			max=Math.max(max, sum1);
			max=Math.max(max, sum2);
		}
		sum1=0;
		sum2=0;
		for(int i=0; i<N; i++) {
			sum1+=arr[i][i];        // ����->������ �밢��
			sum2+=arr[i][N-i-1];   //  ������->���� �밢��
		}
		max=Math.max(max, sum1);
		max=Math.max(max, sum2);
		System.out.println(max);
		
	}
}