import java.util.Arrays;
import java.util.Scanner;
public class Main { 
	
	public static void main(String[] args) { 
	
		Scanner in = new Scanner(System.in);
		int X = 5;   // 5번 입력과 실행
		int[] arr = new int[X];
		int sum=0;
		for(int i=0; i<X; i++) {
			arr[i]=in.nextInt();  
			sum+=arr[i];  // 변수 sum에 배열에 담긴 숫자들을 모두 합함 
		}
		Arrays.sort(arr);
		System.out.println(sum/arr.length); // 평균값
		System.out.println(arr[arr.length/2]); // 배열의 중간 값
		in.close();
	}
}

