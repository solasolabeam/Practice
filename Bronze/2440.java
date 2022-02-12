import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int A = N;
		for (int j = 0; j < N; j++) { // N줄 동안 동작
			for (int i = 0; i < A; i++) {  //N개씩 찍기 
				System.out.print("*");
			}
			A--;   // 별의 개수 하나씩 줄이기
			System.out.println();
		}
		in.close();
	}
}
