import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int S = (in.nextInt()+in.nextInt()+in.nextInt()+in.nextInt());
		int T = (in.nextInt()+in.nextInt()+in.nextInt()+in.nextInt());
		in.close();
		System.out.println(S>=T?S:T);
	}
}