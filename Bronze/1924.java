import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month=in.nextInt();    // ��
		int day=in.nextInt();      // ��
		int cnt=0;
		String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"}; // ������ 0~6 : ��~��
		int[] months= {0,31,28,31,30,31,30,31,31,30,31,30}; // �޿� �ش�Ǵ� �ִ���
		for(int i=0; i<month; i++) {
			cnt+=months[i];   // �ִ��ϼ� ��� ���ϱ�
		}
		cnt+= day;  
		System.out.println(week[cnt%7]); // ���� ���
	}
}