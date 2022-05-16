import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<Integer>();

		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			que.add(i + 1);
		}
		int k = in.nextInt();

		while (que.size() > 1) {
			int cnt = 1;
			while (cnt < k) {
				que.offer(que.poll());
				cnt++;
			}
			que.poll();

		}
		System.out.println(que.poll());
	}
}