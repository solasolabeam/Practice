import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Queue<Character> que = new LinkedList<>();

		Scanner in = new Scanner(System.in);

		String str1 = in.next();
		String str2 = in.next();

		for (char x : str1.toCharArray()) {
			que.offer(x);
		}
		for (char x : str2.toCharArray()) {
			if(que.contains(x)) {
				if(x!=que.poll()) {
					System.out.println("NO");
					return;
				}					
			}
		}
		if(!que.isEmpty()) {
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
		
	}
}
