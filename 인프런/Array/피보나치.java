import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N =in.nextInt();
		int a=1,b=1;
		int c=0;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<N; i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}