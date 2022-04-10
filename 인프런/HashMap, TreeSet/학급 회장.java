import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] ar) {
	HashMap<Character, Integer> hm = new HashMap<>();
	Scanner in =new Scanner(System.in);
	int n=in.nextInt();
	String s =in.next();
	int max=0;
	char result=0;
	for(char x : s.toCharArray()) {
		hm.put(x, hm.getOrDefault(x, 0)+1);  // key에 해당하는 value가 없으면 0으로 초기화 후 1++
		if(max<hm.get(x)) {              // max에 해당하는 value와 key 찾기
			max=hm.get(x);
			result=x;
		}
	}
	System.out.println(result);
	
	
	}
}