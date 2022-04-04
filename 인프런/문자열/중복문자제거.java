import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String answer = "";
		boolean[] check = new boolean[25];
		for (int i = 0; i < str.length(); i++) {
			if (!check[str.charAt(i) - 'a']) 
				answer += str.charAt(i);
				check[str.charAt(i)-'a'] = true;
			
		}
		System.out.println(answer);
	}
}