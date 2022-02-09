import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] str = new int[3];               // 정수형 배열에 3개의 값을 저장
		
	
		
		for(int i=0; i<str.length; i++) {     // 배열에 입력하는대로 저장 
			str[i]=in.nextInt();              // str[0]~str[2] 까지 저장
		}
		Arrays.sort(str);                     // 오름차순 정리 메소드
						
	//	System.out.println(str[1]+str[2]);   테스트 출력

		int A = str[0];                      // 가장 작은수를 A에 저장          
		int B = str[1];                      // 중간수를 B에 저장  
		int C = str[2];                      // 가장 큰수를 C에 저장  
		
		if(A==B&&B==C&&C==A) {                    // 세 숫자가 모두 동일 할때
			System.out.println(10000+A*1000);
		}
		else if(A==B) {                           // 두 숫자가 동일 할때 1#
			System.out.println(1000+A*100);
			
		}
		else if(C==B) {                           // 두 숫자가 동일 할때 2#
			System.out.println(1000+C*100);
			
		}
		else if(A==C) {                           // 두 숫자가 동일 할때 3#
			System.out.println(1000+A*100);
			
		}
		else if(A!=B&&B!=C&&A!=C) {               // 세 숫자가 동일하지 않을떄 
			System.out.println(C*100);
			
		}		
	}
}
