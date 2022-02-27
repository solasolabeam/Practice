import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int D = in.nextInt();
		int H = in.nextInt();
		int W = in.nextInt();

		double num = D / (Math.sqrt(H * H + W * W));

		System.out.print((int)(num * H)+" ");
		System.out.println((int)(num * W));
		in.close();
	}
}
