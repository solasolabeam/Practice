import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str =in.next();
		for(int i=0; i<str.length(); i++) {  // ���ĺ� 1���� ���
			
		System.out.print(str.charAt(i));
		if(i%10==9)                     // 10�� ä��� �ٹٲ�
			System.out.println();
		}
		in.close();
	}
}