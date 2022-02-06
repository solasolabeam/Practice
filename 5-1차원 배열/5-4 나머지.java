import java.util.HashSet;  // HashSet �� �ڹ� Collection �� Set �� �Ļ�Ŭ�����̴�.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		HashSet<Integer> h = new HashSet<Integer>(); 
		//  HashSet<Integer> ���� Ÿ���� Integer�� �����߱� ������ int �� �Ǵ� Integer ��ü�� �־��־���Ѵ�.

		for (int i = 0; i < 10; i++) {
			h.add(in.nextInt() % 42);  // HashSet.add() �޼ҵ�� HashSet�� �����ϴ� �޼ҵ��̴�
		}
		in.close();
		System.out.println(h.size());
		// HashSet �� �����ϸ鼭 �� ������ ������ HashSet �� ����� �Ǵ� ��
	}

}
/*  �� �޼ҵ忡�� ���� ���� �� ���� �ߺ��Ǵ� ���� ������ HashSet �� ����Ǹ鼭 True �� ��ȯ�ϰ�, ���� �ߺ��Ǿ� ������� ������ False �� ��ȯ�Ѵ�.
 *  1. �ߺ��Ǵ� ���Ҹ� ���� ��� �ϳ��� �����Ѵ�. ��, �ߺ����Ҹ� ������� �ʴ´�.
 *  2. HashSet �� ���� ������ ����. ���� Collections.sort() �޼ҵ带 ����� �� ����. ���� ������ �ϰ� �ʹٸ� ����Ʈ�� ��ȯ �� �����ؾ��Ѵ�.
 */