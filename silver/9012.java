import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Stack<Character> stack =new Stack<>();
		int t= in.nextInt();
		boolean check=true;
		for(int i=0; i<t; i++) {
			String s=in.next();
			for(char x : s.toCharArray()) {
				check=true;
				if(x=='(')
					stack.push(x);
				else {
					if(stack.isEmpty()) {
						System.out.println("NO");
						check=false;
						break;
					}
					else
						stack.pop();
						
				}
			}
			if(check) {
			if(stack.isEmpty())
				System.out.println("YES");
			else
				System.out.println("NO");
			}
				stack.clear();
		}

	}
}