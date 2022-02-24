import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int R1 = in.nextInt();
		int S = in.nextInt();

		System.out.println(S * 2 - R1);

		in.close();
	}
}
