import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<Character, Integer> hm = new HashMap<>();
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		boolean check =false;

		for (char x : s1.toCharArray()) {
			hm.put(x, hm.getOrDefault(x, 0) + 1);
		}
		
		for (char x : s2.toCharArray()) {
			if(!hm.containsKey(x) || hm.get(x)==0) {
				System.out.println("NO");
				check =false;
				break;
			}
				hm.put(x, hm.get(x)-1);
				check =true;
		}
		if(check)
		System.out.println("YES");
	}
}