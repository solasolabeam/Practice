import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		char[] s = in.next().toCharArray();
		for(char x : s) {                        // ���ڿ��� ���� ������ �迭�� ����
			if(x=='(') stack.push(x);           // '(' �� ������ pop
			else {
				if(!stack.isEmpty()) stack.pop(); // ¦�������� pop, ������ ����������
				else {
					System.out.println("NO");
					return;
				}
			}
		}
		if(stack.empty()) System.out.println("YES"); // ���� ���ڰ� ������ no ,������ yes
		else
			System.out.println("NO");
		

	}
}