import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int A = in.nextInt();  // ���� ���
		int B = in.nextInt();  // ���� ���
		int C = in.nextInt();  // ��Ʈ�� ����
		long cnt =0;
		long sum=0;
		while(true) {
			cnt++;
			sum=A+B*cnt;
			if(C*cnt>sum) 
				break;
			
		}
		
System.out.println(cnt);
		
		in.close();
	}
}
