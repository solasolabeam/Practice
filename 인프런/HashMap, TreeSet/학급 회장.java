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
		hm.put(x, hm.getOrDefault(x, 0)+1);  // key�� �ش��ϴ� value�� ������ 0���� �ʱ�ȭ �� 1++
		if(max<hm.get(x)) {              // max�� �ش��ϴ� value�� key ã��
			max=hm.get(x);
			result=x;
		}
	}
	System.out.println(result);
	
	
	}
}