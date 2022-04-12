import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=in.nextInt();
		}
		int p1=0,p2=0;
		for(p2=0; p2<k; p2++) {
			hm.put(arr[p2], hm.getOrDefault(arr[p2], 0)+1);
		}
		System.out.print(hm.size()+" ");                               // 매출액의 종류
		while(p2<n) {
			hm.put(arr[p2], hm.getOrDefault(arr[p2], 0)+1);
			hm.put(arr[p1], hm.getOrDefault(arr[p1], 0)-1);
			if(hm.get(arr[p1])==0)
				hm.remove(arr[p1]);
			System.out.print(hm.size()+" ");
			p2++;
			p1++;

		}
	}
}