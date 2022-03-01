import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int A = in.nextInt();  // 고정 비용
		int B = in.nextInt();  // 가변 비용
		int C = in.nextInt();  // 노트북 가격
		
		if(B>=C) {
			System.out.println(-1);
		}
		else {
			System.out.println((A/(C-B))+1);
		}
		in.close();
	}
}
