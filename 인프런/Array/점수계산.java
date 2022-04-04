import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr=new int[N];
		int cnt=0;
		int sum=0;
		for(int i=0; i<N; i++) {		
			arr[i]=in.nextInt();
			if(arr[i]==1)
				cnt++;
			else
				cnt=0;
			sum+=cnt;
			
		}
		System.out.println(sum);
	}
}