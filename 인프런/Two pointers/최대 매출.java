import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int sum = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (i < k)
				sum += arr[i];
			else
				sum = sum + arr[i] - arr[i - k];
			if (max < sum)
				max = sum;
		}
		System.out.println(max);
	}
}