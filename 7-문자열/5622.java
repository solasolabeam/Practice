import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		
		int cnt = 0;  // 걸리는 시간을 저장
		String[] S = { "0", "0", "0", "ABC", "DEF", "GHI", // ABC:4초 이기때문에 [4]에 저장 
				     "JKL", "MNO", "PQRS", "TUV", "WXYZ" };// DEF:5초 이기때문에 [5]에 저장

		for (int j = 0; j < s.length(); j++) {  // 사용자의 입력값의 길이만큼 반복
			for (int i = 0; i < S.length; i++) { 
				if (S[i].contains(Character.toString(s.charAt(j)))) { // 입력한 알파벳과 배열에 저장된 값이포함이
					                                                  // 되어있다면 배열의 인덱스의 번호를 변수 cnt에 더함
					cnt += i;                                         // 배열 인덱스 = 입력의걸리는 초 이기때문

				}

			}
		}

		System.out.println(cnt);
	}
}