import java.util.Scanner;

public class Main {                    

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String str = in.next();			     // 16진수는 문자로 받아야함
		System.out.print(Integer.parseInt(str,16)); // 16진수를 10진수로 변환하여 출력
	}
}
