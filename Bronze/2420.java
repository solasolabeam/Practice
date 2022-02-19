import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long A = in.nextInt();
		long B = in.nextInt();
		in.close();

		if (A - B < 0) {		
			System.out.println((A-B)*-1);
		} else {
			System.out.println(A-B);
		}
	}
}
