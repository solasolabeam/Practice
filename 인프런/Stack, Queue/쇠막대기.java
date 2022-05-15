import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Character> st = new Stack<Character>();
		String str = in.next();
		int cnt=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(') {
				st.push('(');
			}else {
				if(str.charAt(i-1)=='(') {
					st.pop();
					cnt+=st.size();
				} else {
					st.pop();
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}