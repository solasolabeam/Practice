import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] arr=new int[2];
		for(int j=0; j<2; j++) { // 두 수를 비교
		int A = in.nextInt();
		int num=0;
		int sum=0;
		int cnt=100;        // 백의 자리->십의 자리->일의자리 
		
		for(int i=0; i<3; i++) {  // 세 자릿수 범위
		
		
		num=A%10;          // 한 자리씩 숫자 구하기
		A=A/10;
		sum+=num*cnt;
		cnt/=10;           
		}
		arr[j]=sum;   // 거꾸로 구한 값을 배열에 저장
		}
if(arr[0]<arr[1]) {
	System.out.println(arr[1]);
}
else {
	System.out.println(arr[0]);
}
		
		

	}
}