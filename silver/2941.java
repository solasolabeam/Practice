import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" }; // ���ǿ� �ش�Ǵ� ����
		for (int i = 0; i < arr.length; i++) {
			if (str.contains(arr[i])) {
				str = str.replace(arr[i], "!");  // ���ǿ� �����ϸ� ������ ���ڸ� ���ڷ� ����
			}
		}
		System.out.println(str.length());

	}
}