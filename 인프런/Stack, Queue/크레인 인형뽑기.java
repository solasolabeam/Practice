import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		Queue<Integer> qu = new LinkedList<>();
		int cnt = 0;

		int n = in.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		int m = in.nextInt();

		int[] a = new int[m];
		for (int i = 0; i < m; i++) {
			int A = in.nextInt();

			for (int j = 0; j < n; j++) {
				if (arr[j][A - 1] == 0)
					continue;
				if (st.isEmpty())
					st.push(arr[j][A - 1]);
				else {
					if (st.peek() != arr[j][A - 1]) {
						st.push(arr[j][A - 1]);
						arr[j][A - 1] = 0;
						break;
					} else {
						st.pop();
						cnt = cnt + 2;
					}
				}
			}

		}
		System.out.println(cnt);
	}
}