import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		for(int i=0; i<N; i++) {
			String str = new StringBuilder(in.next()).reverse().toString(); // 입력 문자열을 뒤집고 초기화
			int A=Integer.parseInt(str);       // 문자열 > 정수타입으로
			int cnt=0;                        // 소수 판별 카운트
			for(int j=2; j<=A; j++) {
				if(A%j==0)
					cnt++;
			}
			if(cnt==1)
				System.out.print(A+" ");
		}
	}
}