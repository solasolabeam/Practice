import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		int prev=0;
		for(int i=0; i<N; i++) {
			int next=in.nextInt();
			if(prev<next)
				System.out.print(next+" ");
			prev=next;
		}
		
	}
}