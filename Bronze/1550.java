import java.util.Scanner;

public class Main {                    

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String str = in.next();			     // 16������ ���ڷ� �޾ƾ���
		System.out.print(Integer.parseInt(str,16)); // 16������ 10������ ��ȯ�Ͽ� ���
	}
}
