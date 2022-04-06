import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> result =new ArrayList<>();
		int N = in.nextInt();
		int[] arr1=new int[N];
		for(int i=0; i<N; i++) {
			arr1[i]=in.nextInt();
		}
		int M = in.nextInt();
		int[] arr2=new int[M];
		for(int i=0; i<M; i++) {
			arr2[i]=in.nextInt();
		}
		int p1=0, p2=0;
		while(p1<N && p2<M) {
			if(arr1[p1]<arr2[p2]) result.add(arr1[p1++]);
			else result.add(arr2[p2++]);
		}
		while(p1<N) result.add(arr1[p1++]);
		while(p2<M) result.add(arr2[p2++]);
		int total = result.size();
		for(int x : result) {
		System.out.print(x+" ");
		}
	}
}