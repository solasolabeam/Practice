
import java.util.Scanner;

public class Main {                    

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();       // 사람 수 
		int B = in.nextInt();       // 넓이
		int[] arr = new int[5];     // 신문 기사의 사람들을 저장하기 위한 배열 
		for(int i=0; i<5; i++) {
			arr[i] = in.nextInt();  // 5개의 신문
			
		}
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]-A*B+" ");  


			
		}


	}
}
