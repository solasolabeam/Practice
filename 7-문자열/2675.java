import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();  // 입력한 사이클 
ㅔ
		for (int k = 0; k < T; k++) { 
			int R = in.nextInt();  // 숫자만큼 반복출력
			String S = in.next();  // 문자열
			String sum = "";       // 문자열을 저장할 임의의 저장공간

			for (int i = 0; i < S.length(); i++) {  
				for (int j = 0; j < R; j++) {
					sum += Character.toString(S.charAt(i)); //변수 R만큼 반복하여 출력
				}

			}
			System.out.println(sum);
		}
		in.close();

	}
}