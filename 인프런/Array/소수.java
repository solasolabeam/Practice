import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int cnt = 0;
		boolean[] check = new boolean[N + 1];
		for (int i = 2; i <= N; i++) {
			if (!check[i]) {                 // 소수 체크
				cnt++;
				for(int j=i; j<=N; j+=i) {   // i의 배수는 모두 체크
					check[j]=true;
				}
			}
		}
		System.out.println(cnt);

	}
}