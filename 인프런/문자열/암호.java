import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N =in.nextInt();
		String str =in.next();

		for(int i=0; i<N; i++) {
			String tmp =str.substring(0,7).replace("*","0").replace("#", "1");             // 문자열에서 7개씩 뽑기
			int a = Integer.parseInt(tmp, 2); // 2진수를 10진수로 변환
			System.out.print((char)a);       // 아스키 코드로 변환
			str=str.substring(7);          // 다음 뽑을 문자열 준비
		}
	}
}