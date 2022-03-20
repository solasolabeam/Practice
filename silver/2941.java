import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" }; // 조건에 해당되는 문자
		for (int i = 0; i < arr.length; i++) {
			if (str.contains(arr[i])) {
				str = str.replace(arr[i], "!");  // 조건에 부합하면 임의의 한자리 문자로 변경
			}
		}
		System.out.println(str.length());

	}
} 
