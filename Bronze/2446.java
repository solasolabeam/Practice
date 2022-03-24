import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
int cnt=N;
int cnt2=1;
		for (int i = 1; i <= 2*N-1; i++) {
			if(i<=N) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * cnt - 1; j++) {
				System.out.print("*");
			}
			cnt--;
			System.out.println();
			}
			else {
				cnt2++;
				for(int j=0; j<N-cnt2; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<2*cnt2-1; j++){
					
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}