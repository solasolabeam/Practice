import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] arr= {in.nextInt(),in.nextInt(),in.nextInt()};  // 사용자로부터 입력을 3번 받는다
		in.close();
		Arrays.sort(arr); // 오름 차순 메소드
		
		for(int N : arr) {  // 배열에 저장된 값을 하나씩 출력
			System.out.print(N+" ");
		}


	}
}
