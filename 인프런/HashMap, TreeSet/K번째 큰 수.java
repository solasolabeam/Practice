import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class test {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int sum=0;
		int cnt=0;
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=in.nextInt();
		}
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		for(int x : Tset) {
			cnt++;
			if(cnt==k) {
			System.out.println(x);
			break;
		}
			
	}
		if(cnt!=k)
			System.out.println(-1);
}
}