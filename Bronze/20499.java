import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int K =in.nextInt();
		int D = in.nextInt();
		int A = in.nextInt();
		if(K+A<D||D==0) {
			System.out.println("hasu");
		}
		else {
			System.out.println("gosu");
		}

	}
}