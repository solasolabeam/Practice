import java.util.Scanner;

public class test {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		int cnt=0;
		for(int i=0; i<5; i++) {
			int n=in.nextInt();
			if(N==n)
				cnt++;
		}
		System.out.println(cnt);
	}
}