import java.util.Scanner;
import java.math.BigInteger;     // ������ ������ 10�� 1000�����̹Ƿ� BigInteger
public class Main {                    

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		BigInteger n = in.nextBigInteger();   // int ��� BigInteger ���
		BigInteger m = in.nextBigInteger();
		
		System.out.println(n.divide(m));     // BigInteger ���� �Լ� ���
		System.out.println(n.remainder(m));
		
	}
}

/* ���ڿ� ���·� �̷���� �ֱ⿡ ��Ģ������ �ȵȴ�.
   ���� BigInteger�� ���� ����� �Ϸ��� Ŭ���� ������ �Լ��� �̿� �ؾ��Ѵ�. */