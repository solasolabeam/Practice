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
				sum1+=arr[i][j];   // 행 의합
				sum2+=arr[j][i];   // 열 의합
			}
			max=Math.max(max, sum1);
			max=Math.max(max, sum2);
		}
		sum1=0;
		sum2=0;
		for(int i=0; i<N; i++) {
			sum1+=arr[i][i];        // 왼쪽->오른쪽 대각선
			sum2+=arr[i][N-i-1];   //  오른쪽->왼쪽 대각선
		}
		max=Math.max(max, sum1);
		max=Math.max(max, sum2);
		System.out.println(max);
		
	}
}