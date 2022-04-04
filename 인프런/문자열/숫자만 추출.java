import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str =in.next();
		int answer=0;
		for(char x : str.toCharArray()) { // char배열로 변환
			if(x>=48&&x<=57)              // 숫자만 출력
				answer=answer*10+(x-48);
		}
		System.out.println(answer);
	}
}


/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str =in.next();
		String answer="";
		for(char x : str.toCharArray()) {           // char배열로 변환
			if(Character.isDigit(x)) answer+=x;      // 숫자만 문자열에 저장
		}
		System.out.println(Integer.parseInt(answer)); // 문자열을 Int타입으로 변환
	}
}
*/