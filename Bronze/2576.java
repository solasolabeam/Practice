import java.util.Arrays;
import java.util.Scanner;
public class Main { 
	
	public static void main(String[] args) { 
	
		Scanner in = new Scanner(System.in);
		
		int[] arr = {                                // 입력을 7번 받고, 배열에 저장합니다.
		in.nextInt(),in.nextInt(),in.nextInt(),
		in.nextInt(),in.nextInt(),in.nextInt(),
		in.nextInt()};
		in.close();
		Arrays.sort(arr);                            // 배열을 오름차순으로 정리 합니다.
		int val=0;   // 홀수 , 짝수 구분하기위한 값
		int count=0; // 최소 홀수값 분별과 입력된 값이 모두 짝수일때 값이 0
		int sum=0;   // 홀수값들의 합
		int mini=0;  // 값이 최소인 홀수
		
		for(int i=0; i<7; i++) {    // 배열에 저장된 길이만큼 반복
			val=arr[i]%2;    // 나머지가 0이면 짝수, 1이면 홀수
			if(val==1) {     
				sum+=arr[i]; // 값이 홀수이면 sum변수에 값을 더함
				count++;     // 홀수를 찾을때마다 증가
				if(count==1) {  // 최초로찾은 홀수 즉 최소값 홀수 분별
					mini=arr[i];  // 값이 최소인 홀수를 변수 mini에 저장
				}
			}
			
		}
		if(count==0) {        // 홀수가 하나도 없다면  -1 출력
			System.out.print(-1);
		}
		else {
			System.out.println(sum);  // 홀수의 모든 값
			System.out.println(mini); // 최소 홀수
		}
		
		

	}
}

