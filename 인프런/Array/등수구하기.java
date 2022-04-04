import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr=new int[N];
		for(int i=0; i<N; i++) {
			arr[i]=in.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			int cnt=1;
			for(int j=0; j<N; j++) {
				if(arr[i]<arr[j])
					cnt++;
				
			}
			System.out.print(cnt+" ");
		}
	}
}