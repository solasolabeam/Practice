import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		char[] s=in.next().toCharArray();
		for(char x: s) {
			if(x!=')') 				
				stack.push(x);    // ')'를 제외한 문자가 들어가면 스택푸시
			else {
				while(stack.peek()!='(') // 괄호 짝을 찾을때까지 팝
				stack.pop();
				stack.pop();             //')'를 팝
			}
				
		}
		for(char x : stack)
			System.out.print(x);

	}
}
