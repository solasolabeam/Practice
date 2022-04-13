import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		char[] s = in.next().toCharArray();
		for(char x : s) {                        // 문자열을 문자 단위로 배열에 저장
			if(x=='(') stack.push(x);           // '(' 가 들어오면 pop
			else {
				if(!stack.isEmpty()) stack.pop(); // 짝이있으면 pop, 없으면 빠져나오기
				else {
					System.out.println("NO");
					return;
				}
			}
		}
		if(stack.empty()) System.out.println("YES"); // 남은 문자가 있으면 no ,없으면 yes
		else
			System.out.println("NO");
		

	}
}