import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int A = in.nextInt();  // 고정 비용
		int B = in.nextInt();  // 가변 비용
		int C = in.nextInt();  // 노트북 가격
		long cnt =0;
		long sum=0;
		while(true) {
			cnt++;
			sum=A+B*cnt;
			if(C*cnt>sum) 
				break;
			
		}
		
System.out.println(cnt);
		
		in.close();
	}
}
