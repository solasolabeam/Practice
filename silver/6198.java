import java.util.Scanner;
import java.util.Stack;

class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		long result =0;  // (1+80000) /2 * 80000 > Integer.MAX_VALUE
		int N= in.nextInt();
				
		for(int i=0; i<N; i++) {
			int cnt = in.nextInt();
			while(!stack.empty()&&stack.peek()<=cnt) {  // »õ ºôµùÀÌ Àü ºôµùº¸´Ù °°°Å³ª Å©¸é ÆË
				stack.pop();
			}
			result+=stack.size();
			stack.push(cnt);

		}
		System.out.println(result);
	}                                                 
}