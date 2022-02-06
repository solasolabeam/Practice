import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int value = (in.nextInt() * in.nextInt() * in.nextInt()); // 각각 세번의 입력을 곱함
		String str = Integer.toString(value); // 곱한 값을 문자열로 변환하여 저장

		in.close();

		for (int i = 0; i < 10; i++) { // 0~9 까지 해당 되는 숫자 유무를 확인
			int count = 0; // 카운트 하기 위한 변수 지정
			for (int j = 0; j < str.length(); j++) { // 곱한 값의 자리수 만큼 반복 사이클
				if ((str.charAt(j) - '0') == i) { // 아스키 코드 문자를 10진수로 변환하고, 0~9 까지 해당 되는 숫자 유무를 확인
					count++; // 해당 숫자가 맻개 있는지 카운트
				}

			}
			System.out.println(count); // 카운팅 된 수를 각 자릿수별로 출력
		}

	}

}
