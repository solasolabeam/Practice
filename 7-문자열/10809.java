import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String S = in.next();
		int[] arr = new int[26];  // a~z 까지 알파벳 총 26자를 배열에 저장
		int alpa = 0;   // 문자로 받은 알파벳을 정수로 변환 ex) 'a'-> 65  // 'a'-'a'= 0
		for (int i = 0; i < 26; i++) {
			arr[i] = -1;   // 모든 원소들을 -1로 저장
		}
		for (int i = 0; i < S.length(); i++) {
			alpa = S.charAt(i) - 'a';  // 알파벳 a부터 z까지를 0~25로 받게끔 지정

			for (int j = 0; j < 26; j++) { //  한 자리씩 알파벳 하나하나 검별 
				if (j == alpa) {    // 현재 순번과 알파벳 값이 일치하면, 그 위치에 단어의 자리값을 저장
					if (arr[alpa] > -1)  // 만약 값이 한번이상 자리값을 저장 받았다면 
						continue;        //  무시
					arr[alpa] = i;    //  그 위치에 단어의 자리값을 저장
				}
			}
		}
		for (int i : arr) {  // 배열에 있던 원소들을 하나씩 모두 출력
			System.out.println(i);
		}

	}
}