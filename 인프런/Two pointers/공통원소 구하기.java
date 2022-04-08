import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int m = in.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = in.nextInt();
		}
		Arrays.sort(b);
		int p1 = 0, p2 = 0;
		while (p1 < n && p2 < m) {
			if (a[p1] == b[p2]) {
				list.add(a[p1++]);  // 공통원소이면 출력하고 p1,p2 ++
				p2++;
			} else if (a[p1] < b[p2]) {   // 더 작으쪽 ++
				p1++;
			} else
				p2++;
		}
		for(int x : list)
			System.out.print(x+" ");
	}
}