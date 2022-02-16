import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();

		int a = 0; // 시침증가 카운트
		a = (B + C) / 60;
		B += C;

		if (B >= 60) {
			A += a;  // 시침 증가
			B %= 60; // 60분==00분

		}
		if (A >= 24) {
			A = A % 24; //24시==00시
		}
		System.out.println(A);
		System.out.println(B);
		in.close();
	}
	
	
}