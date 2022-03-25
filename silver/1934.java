import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		for(int i=0; i<N; i++) {
		int A = in.nextInt();
		int B = in.nextInt();
		int a=Math.max(A, B);
		int b=Math.min(A, B);
		int cnt=b;
		while(true) {
			if(a%cnt==0&&b%cnt==0) {
				break;
			}
			cnt--;
		}
		System.out.println(a*b/cnt);
		}
	}
}