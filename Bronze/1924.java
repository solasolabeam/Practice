import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month=in.nextInt();    // 월
		int day=in.nextInt();      // 일
		int cnt=0;
		String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"}; // 나머지 0~6 : 일~토
		int[] months= {0,31,28,31,30,31,30,31,31,30,31,30}; // 달에 해당되는 최대일
		for(int i=0; i<month; i++) {
			cnt+=months[i];   // 최대일수 계속 더하기
		}
		cnt+= day;  
		System.out.println(week[cnt%7]); // 요일 출력
	}
}