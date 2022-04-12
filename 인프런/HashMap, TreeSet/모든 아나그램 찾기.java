import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<Character, Integer> map1 = new HashMap<>();   // ���ڿ� t�� ���� ��
		HashMap<Character, Integer> map2 = new HashMap<>();   // ���ڿ� s�� ���� ��
		Scanner in= new Scanner(System.in);
		char[] s=in.next().toCharArray();                     // ���ڿ� s�� characterŸ�� �迭�� �ʱ�ȭ
		String t=in.next();
		int cnt=0;
		
		for(char x : t.toCharArray())                          // map1�� ������ t�� Ű,�� �� ����
			map1.put(x, map1.getOrDefault(x, 0)+1);

		int p1=0,p2=0;                                         // sliding window ������Ʈ
		for(p2=0; p2<t.length(); p2++) {                       
			map2.put(s[p2], map2.getOrDefault(s[p2], 0)+1);    // map2�� ���ڿ� s�� Ű,���� ����
			
		}
		if(map1.equals(map2))                               // map1 �� map2�� Ű,���� �����ϸ� ī��Ʈ
			cnt++;
		while(p2<s.length) {
			map2.put(s[p2], map2.getOrDefault(s[p2],0)+1);
			p2++;
			map2.put(s[p1], map2.getOrDefault(s[p1], 0)-1);     // �����츦 ������ �и鼭 Ű,���� -1 
			if(map2.get(s[p1])==0)                              // Ű�� �� �������� remove
				map2.remove(s[p1]);
			p1++;
			if(map1.equals(map2))                      
				cnt++;
		}
		System.out.println(cnt);
	}
}