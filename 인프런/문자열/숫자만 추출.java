import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str =in.next();
		int answer=0;
		for(char x : str.toCharArray()) { // char�迭�� ��ȯ
			if(x>=48&&x<=57)              // ���ڸ� ���
				answer=answer*10+(x-48);
		}
		System.out.println(answer);
	}
}


/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str =in.next();
		String answer="";
		for(char x : str.toCharArray()) {           // char�迭�� ��ȯ
			if(Character.isDigit(x)) answer+=x;      // ���ڸ� ���ڿ��� ����
		}
		System.out.println(Integer.parseInt(answer)); // ���ڿ��� IntŸ������ ��ȯ
	}
}
*/