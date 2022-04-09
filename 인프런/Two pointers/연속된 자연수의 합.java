import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int m = n/2+1;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		int lt = 0;
		int sum = 0;
		int cnt = 0;
		for(int rt=0; rt<m; rt++) {
			sum+=arr[rt];
			if(sum==n) cnt++;
			while(sum>=n) {
				sum-=arr[lt++];
				if(sum==n) { 
					cnt++;
				}
			}
			
		}
		System.out.println(cnt);

	}
}