
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr =new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=in.nextInt();			
		}
		Arrays.sort(arr);
		int x =in.nextInt();
		
		int p1=0,p2=n-1;
		int sum=0,cnt=0; 
		while(p1<p2) {
			sum=arr[p1]+arr[p2];
			if(sum==x) {
				cnt++;
				p1++;
			}
			else if(sum<x) {
				p1++;
			}
			else {
				p2--;
			}
		}
		System.out.println(cnt);
	}
}