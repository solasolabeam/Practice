
import java.util.Scanner;

public class Main {                    

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<5; i++) {
			int a = in.nextInt();  // 5번의 입력을 받음
			sum +=Math.pow(a, 2);  // 거듭제곱
			
		}
	

		
		System.out.println(sum%10);
	}
}
