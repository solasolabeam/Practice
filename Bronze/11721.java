import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str =in.next();
		for(int i=0; i<str.length(); i++) {  // 알파벳 1개씩 출력
			
		System.out.print(str.charAt(i));
		if(i%10==9)                     // 10번 채우면 줄바꿈
			System.out.println();
		}
		in.close();
	}
}