import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();

		int a = 0; // ��ħ���� ī��Ʈ
		a = (B + C) / 60;
		B += C;

		if (B >= 60) {
			A += a;  // ��ħ ����
			B %= 60; // 60��==00��

		}
		if (A >= 24) {
			A = A % 24; //24��==00��
		}
		System.out.println(A);
		System.out.println(B);
		in.close();
	}
	
	
}