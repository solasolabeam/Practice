import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] arr = new int[20];
		int temp=0;
		
		for(int i =0; i<arr.length; i++) { // 1~20 까지 숫자가 들어있는 배열
			arr[i]=i+1;
		}
		for (int i = 0; i < 10; i++) { // L~R 까지 역순으로 배치 10번 반복
			int L = in.nextInt();
			int R = in.nextInt();
			L-=1;
			R-=1;

			while(L<=R) {     // 역순으로 배열 저장하기
				temp=arr[L];
				arr[L]=arr[R];
				arr[R]=temp;
				
				L++;
				R--;
				
			}
			

		}
		for(int i=0; i<20; i++) {   // 배치 끝난 배열 차례로 출력
			System.out.print(arr[i]+" ");
		}
in.close();
	}
}
