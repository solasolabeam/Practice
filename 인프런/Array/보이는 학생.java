import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N =in.nextInt();
		int min=0;
		int cnt=0;
		for(int i=0; i<N; i++) {
			int n= in.nextInt();
			if(min<n) {
				cnt++;
				min=n;
			}
			
		}
		System.out.println(cnt);
	}
}